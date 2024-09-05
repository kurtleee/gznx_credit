package com.uniview.workflow.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.dto.PostLoanDto;

public interface PostLoanService {
    /**
     * 发起贷款申请
     * @param postLoanDto
     * @return
     */
    ResponseData<?> startPostLoan(PostLoanDto postLoanDto);

    /**
     * 客户经理shiro权限
     * @return
     */
    ResponseData<?> clientManager();

    /**
     * 客户经理审批
     * @param taskId
     * @param flag
     * @return
     */
    ResponseData<?> clientManagerPostLoan(String taskId, Integer flag);

    /**
     * 网点经理
     * @param
     * @return
     */
    ResponseData<?> networkManager();

    /**
     * 网点经理审批
     * @param taskId
     * @param flag
     * @return
     */
    ResponseData<?> networkManagerPostLoan(String taskId, Integer flag);

    /**
     * 行政负责人
     * @param
     * @return
     */
    ResponseData<?> department();

    /**
     * 行政负责人审批
     * @param taskId
     * @param
     * @return
     */
    ResponseData<?> departmentPostLoan(String taskId,Integer flag);
}
