package com.uniview.postloan.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.TaskRule;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【task_rule(任务规则主列表)】的数据库操作Service
* @createDate 2024-08-31 16:09:00
*/
public interface TaskRuleService extends IService<TaskRule> {

    ResponseData<?> getTaskRule(TaskRule taskRule);

    ResponseData<?> addTaskRule(TaskRule taskRule);

    ResponseData<?> updateTaskRule(TaskRule taskRule);

    ResponseData<?> deleteTaskRule(TaskRule taskRule);
}
