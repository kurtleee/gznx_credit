package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.TaskRule;
import com.uniview.postloan.service.TaskRuleService;
import com.uniview.postloan.mapper.TaskRuleMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【task_rule(任务规则主列表)】的数据库操作Service实现
* @createDate 2024-08-31 16:09:00
*/
@Service
public class TaskRuleServiceImpl extends ServiceImpl<TaskRuleMapper, TaskRule>
    implements TaskRuleService{

    @Override
    public ResponseData<?> getTaskRule(TaskRule taskRule) {
        return null;
    }

    @Override
    public ResponseData<?> addTaskRule(TaskRule taskRule) {
        return null;
    }

    @Override
    public ResponseData<?> updateTaskRule(TaskRule taskRule) {
        return null;
    }

    @Override
    public ResponseData<?> deleteTaskRule(TaskRule taskRule) {
        return null;
    }
}




