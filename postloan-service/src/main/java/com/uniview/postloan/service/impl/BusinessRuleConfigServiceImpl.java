package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.BusinessRuleConfig;
import com.uniview.postloan.service.BusinessRuleConfigService;
import com.uniview.postloan.mapper.BusinessRuleConfigMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author Administrator
* @description 针对表【business_rule_config(业务规则配置表)】的数据库操作Service实现
* @createDate 2024-08-31 16:07:50
*/
@Service
public class BusinessRuleConfigServiceImpl extends ServiceImpl<BusinessRuleConfigMapper, BusinessRuleConfig>
    implements BusinessRuleConfigService{

    @Override
    public ResponseData<?> getBusinessRuleConfigList(BusinessRuleConfig businessRuleConfig) {
        return null;
    }

    @Override
    public ResponseData<?> updateBusinessRuleConfig(BusinessRuleConfig businessRuleConfig) {
        return null;
    }

    @Override
    public ResponseData<?> addBusinessRuleConfig(BusinessRuleConfig businessRuleConfig) {
        return null;
    }

    @Override
    public ResponseData<?> batchDelete(List<Integer> ids) {
        return null;
    }
}




