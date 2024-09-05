package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.dto.CustomerDto;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.dto.LoanDto;
import com.uniview.postloan.dto.NotificationDto;
import com.uniview.postloan.feign.CustomerFeign;
import com.uniview.postloan.feign.LoanFeign;
import com.uniview.postloan.feign.NotificationFeign;
import com.uniview.postloan.mapper.CasesMapper;
import com.uniview.postloan.mapper.CollectionTaskMapper;
import com.uniview.postloan.mapper.LitigationManagementMapper;
import com.uniview.postloan.pojo.CollectionRecord;
import com.uniview.postloan.pojo.CollectionTask;
import com.uniview.postloan.pojo.LitigationManagement;
import com.uniview.postloan.service.CasesService;
import com.uniview.postloan.service.CollectionRecordService;
import com.uniview.postloan.mapper.CollectionRecordMapper;
import com.uniview.postloan.service.LitigationManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
* @author Administrator
* @description 针对表【collection_record(催收记录)】的数据库操作Service实现
* @createDate 2024-08-31 16:08:05
*/

@Service
public class CollectionRecordServiceImpl extends ServiceImpl<CollectionRecordMapper, CollectionRecord>
    implements CollectionRecordService{
    @Autowired
    private CollectionTaskMapper collectionTaskMapper;
    @Autowired
    private CollectionRecordMapper collectionRecordMapper;
    @Autowired
    private LitigationManagementService litigationManagementService;
    @Autowired
    private CustomerFeign customerFeign;
    @Autowired
    private LoanFeign loanFeign;
    @Autowired
    private NotificationFeign notificationFeign;
    @Autowired
    private CasesService casesService;

    @Override
    public ResponseData<?> getCollectionRecordList(CollectionRecord collectionRecord) {
        return new ResponseData<>().success(collectionRecordMapper.selectList(null));
    }

    /**
     * 增加催收记录
     * @param collectionRecord
     * @return
     */
    @Override
    public ResponseData<?> addCollectionRecord(CollectionRecord collectionRecord) {
        //查询贷款表，根据贷款状态判定是否逾期
        Long taskId = collectionRecord.getTaskId();
        LoanDto loanDto = collectionTaskMapper.findLoanStatus(taskId);
        String loanStatus = loanDto.getLoanStatus();
        if ("未逾期".equals(loanStatus)){
            return new ResponseData<>().success();
        }
        //贷款已逾期，发送通知
        NotificationDto notificationDto = new NotificationDto();
        notificationDto.setSendTo("1583819217@qq.com");
        notificationDto.setTitle("银行催收消息");
        //发送消息
        notificationDto.setMessage("您的贷款已逾期，请及时还款，否则将影响您的信用评级。");
        //接受人为客户
//        notificationDto.setRecipientId(loanDto.getCustomerId());
//        notificationDto.setRecipientId(loanById.getData().getCustomerId());
        //发送消息
        notificationFeign.sendSimpleNotification(notificationDto);
        //更新催收记录表
        collectionRecord.setContactResult("已催收");
        collectionRecord.setCreatedAt(new Date());
        collectionRecord.setUpdatedAt(new Date());
        collectionRecord.setContactMethod("邮件催收");
        collectionRecord.setContactDate(new Date());
        collectionRecord.setCustomerId(loanDto.getCustomerId());
//        CustomerDto customerById = customerFeign.getCustomerById(loanDto.getCustomerId());
//        CustomerDto customerById = customerFeign.getCustomerById(loanById.getData().getCustomerId());
//        collectionRecord.setCustomerId(customerById.getCustomerId());
        save(collectionRecord);
        //更新诉讼管理表
        LitigationManagement litigationManagement = new LitigationManagement();
        litigationManagement.setCustomerId(collectionRecord.getCustomerId());
//        litigationManagement.setCustomerId(customerById.getCustomerId());
        litigationManagement.setLitigationStatus("已提交");
        litigationManagement.setInitiatedDate(new Date());
        litigationManagement.setExpirationDate(new Date());
        litigationManagementService.saveOrUpdate(litigationManagement);
        return new ResponseData<>().success();
    }
}




