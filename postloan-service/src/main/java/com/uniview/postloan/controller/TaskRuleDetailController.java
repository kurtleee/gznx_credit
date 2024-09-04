package com.uniview.postloan.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.TaskRuleDetails;
import com.uniview.postloan.service.TaskRuleDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务规则详情控制器
 */
@RestController
@RequestMapping("/task-rule-detail")
public class TaskRuleDetailController {
    @Autowired
    private TaskRuleDetailsService taskRuleDetailsService;
    //添加任务规则详情
    @PostMapping("/addDetail")
    public ResponseData<?> addDetail(@RequestBody TaskRuleDetails taskRuleDetails){
        return taskRuleDetailsService.addDetail(taskRuleDetails);
    }

}
