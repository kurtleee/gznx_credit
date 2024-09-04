package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uniview.common.dto.CustomerDto;
import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.dto.CollectionPolicyDto;
import com.uniview.postloan.feign.CustomerFeign;
import com.uniview.postloan.mapper.CollectionRecordMapper;
import com.uniview.postloan.mapper.LitigationManagementMapper;
import com.uniview.postloan.pojo.CollectionRecord;
import com.uniview.postloan.pojo.CollectionTask;
import com.uniview.postloan.pojo.LitigationManagement;
import com.uniview.postloan.service.CollectionTaskService;
import com.uniview.postloan.mapper.CollectionTaskMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【collection_task(催收任务)】的数据库操作Service实现
* @createDate 2024-08-30 11:29:09
*/
@Service
public class CollectionTaskServiceImpl extends ServiceImpl<CollectionTaskMapper, CollectionTask>
    implements CollectionTaskService{
    @Autowired
    private CollectionTaskMapper collectionTaskMapper;
    @Autowired
    private CollectionRecordMapper collectionRecordMapper;
    @Autowired
    private LitigationManagementMapper litigationManagementMapper;
    @Autowired
    private CustomerFeign customerFeign;
    //查询全部
    @Override
    public ResponseData<?> queryCollectionPolicy(CollectionTask collectionTask) {
        List<CollectionTask> collectionPolicies = collectionTaskMapper.queryAll(collectionTask);
        return new ResponseData<>().success(collectionPolicies);
    }
    //创建催收任务
    @Override
    public ResponseData<?> addCollectionPolicy(CollectionTask collectionTask) {
        collectionTaskMapper.insert(collectionTask);
        return new ResponseData<>().success();
    }
    //分页查询
    @Override
    public ResponseData<?> queryCollectionPolicyParam(ParamData<CollectionPolicyDto> paramData) {
        PageHelper.startPage(paramData.getPage(), paramData.getSize());
        List<CollectionPolicyDto> collectionPolicies = collectionTaskMapper.queryByCondition(paramData.getParam());
        PageInfo pageInfo = new PageInfo(collectionPolicies);
        return new ResponseData<>().success(pageInfo);
    }
    //批量删除
    @Override
    public ResponseData<?> batchDelete(List<Integer> ids) {

        if (ids.size() == 1) {
            // 单独删除
            collectionTaskMapper.deleteById(ids.get(0));
        } else {
            // 批量删除
            collectionTaskMapper.batchDelete(ids);
        }
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> updateRuleStatus(int ruleStatus) {
        collectionTaskMapper.updateRuleStatus(ruleStatus);
        return new ResponseData<>().success();
    }

    /**
     * 根据客户ID和贷款ID，创建催收任务，并尝试进行催收
     * @param customerId
     * @param loanId
     * @return
     */
    @Override
    public ResponseData<?> initiateCollectionProcess(Long customerId, Long loanId, Integer caseId) {
        //检查贷款是否逾期
        CustomerDto customerDto = customerFeign.getCustomerById(customerId);
        boolean isOverdue = checkIfOverdue(loanId);
        if (isOverdue) {
            // 创建催收任务
            CollectionTask task = createCollectionTask(customerDto,loanId);
            collectionTaskMapper.insertCollectionTask(task);

            // 尝试催收
            boolean isCollectionSuccessful = attemptCollection(task);

            // 根据催收结果进行后续操作
            if (isCollectionSuccessful) {
                // 更新催收任务状态为完成
                collectionTaskMapper.updateCollectionTaskStatus(task.getTaskId(), "催收完成");
            } else {
                // 创建诉讼管理记录
                LitigationManagement litigation = createLitigation(caseId);
                litigationManagementMapper.insertLitigationManagement(litigation);
            }
        }
        return null;
    }

    /**
     * 检查贷款是否逾期
     * @param loanId
     * @return
     */
    @Override
    public Boolean checkIfOverdue(Long loanId) {
        CollectionTask loan = getById(loanId);
        //如果催收任务不存在，则默认认为贷款未逾期
        if (loan.getRuleStatus().equals("未逾期")) {
            // 进行逾期检查
            return true;
        } else {
            // 贷款已逾期
            return false;
        }
    }

    /**
     * 创建催收任务
     * @param loanId
     * @return
     */
    @Override
    public CollectionTask createCollectionTask(CustomerDto customerDto, Long loanId) {
        //实现创建催收任务的逻辑
        CollectionTask loan = getById(loanId);
        if (loan.getRuleStatus().equals("已逾期")){
            // 已逾期，创建催收任务
            CollectionTask task = new CollectionTask();
            CustomerDto customerById = customerFeign.getCustomerById(customerDto.getCustomerId());
            task.setLoanId(loan.getLoanId());
            task.setRuleStatus(loan.getRuleStatus());
            task.setCreatedAt(loan.getCreatedAt());
            task.setUpdatedAt(loan.getUpdatedAt());
            return task;
        }
        return null;
    }

    @Override
    public Boolean attemptCollection(CollectionTask task) {
        //
        return null;
    }

    @Override
    public CollectionRecord createCollectionRecord(Long taskId, boolean success) {
        return null;
    }

    @Override
    public LitigationManagement createLitigation(Integer caseId) {
        return null;
    }
}




