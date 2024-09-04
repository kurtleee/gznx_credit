package com.uniview.postloan.controller;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.dto.CollectionPolicyDto;
import com.uniview.postloan.pojo.BusinessRuleConfig;
import com.uniview.postloan.pojo.CollectionTask;
import com.uniview.postloan.service.BusinessRuleConfigService;
import com.uniview.postloan.service.CollectionTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 业务规则配置controller
 */
@RestController
@RequestMapping("/business-rule-config")
public class BusinessRuleConfigController {
    @Autowired
    private BusinessRuleConfigService businessRuleConfigService;
    //查询催收管理规则配置列表
    @PostMapping("/getBusinessRuleConfigList")
    public ResponseData<?> getBusinessRuleConfigList(@RequestBody BusinessRuleConfig businessRuleConfig) {
        return businessRuleConfigService.getBusinessRuleConfigList(businessRuleConfig);
    }
    //修改催收管理规则配置
    @PostMapping("/updateBusinessRuleConfig")
    public ResponseData<?> updateRuleStatus(@RequestParam BusinessRuleConfig businessRuleConfig) {
        return businessRuleConfigService.updateBusinessRuleConfig(businessRuleConfig);
    }

   //新增催收管理规则配置

    @PostMapping("/addBusinessRuleConfig")
    public ResponseData<?> addBusinessRuleConfig(@RequestBody BusinessRuleConfig businessRuleConfig) {
        return businessRuleConfigService.addBusinessRuleConfig(businessRuleConfig);
    }

    //根据ID删除催收管理规则配置
    @PostMapping("/deleteBusinessRuleConfig")
    public ResponseData<?> deleteBusinessRuleConfig(@RequestBody List<Integer> ids) {
        return businessRuleConfigService.batchDelete(ids);
    }

}
