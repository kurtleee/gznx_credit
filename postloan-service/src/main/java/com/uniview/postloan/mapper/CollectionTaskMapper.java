package com.uniview.postloan.mapper;

import com.uniview.postloan.dto.CollectionPolicyDto;
import com.uniview.postloan.dto.LoanDto;
import com.uniview.postloan.pojo.CollectionTask;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author Administrator
* @description 针对表【collection_task(催收任务)】的数据库操作Mapper
* @createDate 2024-08-30 11:29:09
* @Entity com.uniview.postloan.pojo.CollectionTask
*/
public interface CollectionTaskMapper extends BaseMapper<CollectionTask> {
    List<CollectionTask> queryAll(CollectionTask collectionTask);
    List<CollectionPolicyDto> queryByCondition(CollectionPolicyDto collectionPolicyDto);
    void batchDelete(List<Integer> ids);
    void updateRuleStatus(int ruleStatus);
    void updateCollectionPolicy(CollectionTask collectionTask);
    CollectionTask findCollectionTaskById(int taskId); // 根据ID查找催收任务
    List<CollectionTask> findAllCollectionTasks(); // 查找所有催收任务
    void updateCollectionTaskStatus(Long taskId, String status); // 更新催收任务状态
    /**
     * 插入催收任务
     * @param task
     */
    void insertCollectionTask(CollectionTask task);
    LoanDto findLoanStatus(Long taskId);
}




