package com.uniview.postloan.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.BusinessRuleConfig;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author Administrator
* @description 针对表【business_rule_config(业务规则配置表)】的数据库操作Service
* @createDate 2024-08-31 16:07:50
*/
public interface BusinessRuleConfigService extends IService<BusinessRuleConfig> {

    ResponseData<?> getBusinessRuleConfigList(BusinessRuleConfig businessRuleConfig);

    ResponseData<?> updateBusinessRuleConfig(BusinessRuleConfig businessRuleConfig);

    ResponseData<?> addBusinessRuleConfig(BusinessRuleConfig businessRuleConfig);

    ResponseData<?> batchDelete(List<Integer> ids);
}
