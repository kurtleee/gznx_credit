package com.uniview.personal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uniview.common.dto.CustomerDto;
import com.uniview.common.dto.UserDto;
import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.dto.ApplicationQueryDTO;
import com.uniview.personal.dto.ApplicationResponseDTO;
import com.uniview.personal.dto.ApplyApplicationDTO;
import com.uniview.personal.feign.CustomerFeign;
import com.uniview.personal.feign.UserFeign;
import com.uniview.personal.mapper.AssociatedBusinessInformationMapper;
import com.uniview.personal.mapper.CreditApplicationsMapper;
import com.uniview.personal.pojo.AssociatedBusinessInformation;
import com.uniview.personal.pojo.CreditApplications;
import com.uniview.personal.service.CreditApplicationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

/**
* @author kurtlee
* @description 针对表【credit_applications】的数据库操作Service实现
* @createDate 2024-08-28 14:47:29
*/
@Service
public class CreditApplicationsServiceImpl extends ServiceImpl<CreditApplicationsMapper, CreditApplications>
    implements CreditApplicationsService {
    @Autowired
    private CreditApplicationsMapper creditApplicationsMapper;

    /**
     * 条件查询申请列表
     */
    @Override
    public ResponseData<?> getApplications(ParamData<ApplicationQueryDTO> paramData) {
        PageHelper.startPage(paramData.getPage(),paramData.getSize());
        PageInfo<ApplicationResponseDTO>pageInfo =new PageInfo<>(creditApplicationsMapper.getApplications(paramData.getParam()));
        return new ResponseData<>().success(pageInfo);
    }

    @Autowired
    private CustomerFeign customerFeign;
    @Autowired
    private UserFeign userFeign;
    /**
     * 提交申请
     */
    @Override
    public ResponseData<?> applyApplications(ApplyApplicationDTO applyApplicationDTO) {
        CreditApplications creditApplications = new CreditApplications();
        // UUID生成进件编号
        creditApplications.setEntryId(UUID.randomUUID().toString());
        // 根据身份证号查询客户信息
        CustomerDto customer = customerFeign.getCustomerByIdCard(applyApplicationDTO.getIdNumber());
        creditApplications.setClientNumber(customer.getCustomerType());
        creditApplications.setCreditRating(customer.getCreditRating());
        // 根据信用等级确定授信额度
        creditApplications.setCreditAmount(customerFeign.creditLimitQuery(customer.getCreditRating()));
        // 根据规则确定授信有效期和生效日
        creditApplications.setCreditValidityPeriod(customerFeign.creditTermQuery(customer.getCreditRating()));
        // 当天生效
        creditApplications.setCreditEffectiveDate(new Date());
        // 客户经理
        Long managerNumber = applyApplicationDTO.getManagerNumber();
        UserDto user = userFeign.getUserById(managerNumber);
        creditApplications.setClientManager(managerNumber);
        // 申请日期
        creditApplications.setApplicationDate(new Date());
        // 主管网点
        creditApplications.setMainNetPoint(user.getBranch());
        // 审批状态
        creditApplications.setApprovalStatus(0);
        // 保存申请信息
        save(creditApplications);
        return new ResponseData<>().success();
    }


}




