package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.TaskRuleDetails;
import com.uniview.postloan.service.TaskRuleDetailsService;
import com.uniview.postloan.mapper.TaskRuleDetailsMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【task_rule_details(任务规则详情)】的数据库操作Service实现
* @createDate 2024-08-31 16:09:08
*/
@Service
public class TaskRuleDetailsServiceImpl extends ServiceImpl<TaskRuleDetailsMapper, TaskRuleDetails>
    implements TaskRuleDetailsService{

    @Override
    public ResponseData<?> addDetail(TaskRuleDetails taskRuleDetails) {
        return null;
    }
}




