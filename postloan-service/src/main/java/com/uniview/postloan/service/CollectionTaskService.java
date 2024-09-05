package com.uniview.postloan.service;

import com.uniview.common.dto.CustomerDto;
import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.dto.CollectionPolicyDto;
import com.uniview.postloan.pojo.CollectionRecord;
import com.uniview.postloan.pojo.CollectionTask;
import com.baomidou.mybatisplus.extension.service.IService;
import com.uniview.postloan.pojo.LitigationManagement;

import java.util.List;

/**
* @author Administrator
* @description 针对表【collection_task(催收任务)】的数据库操作Service
* @createDate 2024-08-30 11:29:09
*/
public interface CollectionTaskService extends IService<CollectionTask> {
    ResponseData<?> queryCollectionPolicy(CollectionTask collectionTask);
    ResponseData<?> addCollectionPolicy(CollectionTask collectionTask);
    ResponseData<?> queryCollectionPolicyParam(ParamData<CollectionPolicyDto> paramData);
    ResponseData<?> batchDelete(List<Integer> ids);
    ResponseData<?> updateRuleStatus(int ruleStatus);
    ResponseData<?> initiateCollectionProcess(Long customerId, Long loanId,Integer caseId);
    Boolean checkIfOverdue(Long loanId);
    CollectionTask createCollectionTask(CustomerDto customer, Long loanId);
    Boolean attemptCollection(CollectionTask task);
    CollectionRecord createCollectionRecord(Long taskId, boolean success);
    LitigationManagement createLitigation(Integer caseId);
}
