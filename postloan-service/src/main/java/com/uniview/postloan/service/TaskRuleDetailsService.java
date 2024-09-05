package com.uniview.postloan.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.TaskRuleDetails;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【task_rule_details(任务规则详情)】的数据库操作Service
* @createDate 2024-08-31 16:09:08
*/
public interface TaskRuleDetailsService extends IService<TaskRuleDetails> {

    ResponseData<?> addDetail(TaskRuleDetails taskRuleDetails);
}
