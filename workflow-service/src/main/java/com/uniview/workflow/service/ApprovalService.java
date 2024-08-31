package com.uniview.workflow.service;

import com.uniview.common.utils.ResponseData;

/**
 * @author ：zx
 * @date ：Created in 2024/8/31 11:28
 * @description：
 * @modified By：
 * @version: $
 */
public interface ApprovalService {
    ResponseData<?> startApproval();
    ResponseData<?> clientManager();
    ResponseData<?> clientManagerApproval(String taskId, Integer flag);
    ResponseData<?> administrativePosition();
    ResponseData<?> administrativeApproval(String taskId);
    ResponseData<?> department(String assignee);
    ResponseData<?> departmentApproval(String taskId, Integer childrenFlag);
    ResponseData<?> clerk(String assignee);
    ResponseData<?> clerkApproval(Integer flag, String taskId);
}
