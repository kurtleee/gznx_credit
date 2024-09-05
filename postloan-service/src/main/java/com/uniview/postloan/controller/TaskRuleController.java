package com.uniview.postloan.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.PostloanFollowupList;
import com.uniview.postloan.pojo.TaskRule;
import com.uniview.postloan.service.TaskRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 任务管理规则接口
 */
@RestController
@RequestMapping("/task-rule")
public class TaskRuleController {
    @Autowired
    private TaskRuleService taskRuleService;
    //查看任务规则
    @PostMapping("/getTaskRule")
    public ResponseData<?> getTaskRule(@RequestBody TaskRule taskRule) {
        return taskRuleService.getTaskRule(taskRule);
    }
    //添加任务规则
    @PostMapping("/addTaskRule")
    public ResponseData<?> addTaskRule(@RequestBody TaskRule taskRule) {
        return taskRuleService.addTaskRule(taskRule);
    }
    //修改任务规则
    @PostMapping("/updateTaskRule")
    public ResponseData<?> updateTaskRule(@RequestBody TaskRule taskRule) {
        return taskRuleService.updateTaskRule(taskRule);

    }

    //删除任务规则
    @PostMapping("/deleteTaskRule")
    public ResponseData<?> deleteTaskRule(@RequestBody TaskRule taskRule) {
        return taskRuleService.deleteTaskRule(taskRule);
    }


}
