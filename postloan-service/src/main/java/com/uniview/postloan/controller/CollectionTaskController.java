package com.uniview.postloan.controller;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.dto.CollectionPolicyDto;
import com.uniview.postloan.pojo.CollectionTask;
import com.uniview.postloan.service.CollectionTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 催收管理规则Controller
 */
@RestController
@RequestMapping("/collection-task")
public class CollectionTaskController {
    @Autowired
    private CollectionTaskService collectionTaskService;
    //查询催收管理规则配置列表
    @PostMapping("/getCollectionTask")
    public ResponseData<?> getCollectionTask(@RequestBody CollectionTask collectionTask) {
        return collectionTaskService.queryCollectionPolicy(collectionTask);
    }
//    //查询催收管理规则配置详情
    @PostMapping("/getByCondition")
    public ResponseData<?> queryCondition(@RequestBody ParamData<CollectionPolicyDto> paramData) {
        return collectionTaskService.queryCollectionPolicyParam(paramData);
    }

//    //新增催收管理规则配置

    @PostMapping("/addCollectionTask")
    public ResponseData<?> addCollectionTask(@RequestBody CollectionTask collectionTask) {
        return collectionTaskService.addCollectionPolicy(collectionTask);
    }

//    //修改催收管理规则配置

    @PostMapping("/updateRuleStatus")
    public ResponseData<?> updateRuleStatus(@RequestParam int ruleStatus) {
        return collectionTaskService.updateRuleStatus(ruleStatus);
    }

//    //根据ID删除催收管理规则配置
    @PostMapping("/deleteCollectionTask")
    public ResponseData<?> deleteCollectionTask(@RequestBody List<Integer> ids) {
        return collectionTaskService.batchDelete(ids);
    }

}
