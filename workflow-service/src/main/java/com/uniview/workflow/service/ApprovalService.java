package com.uniview.workflow.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.dto.CreditApplicationsDTO;

import java.io.IOException;

/**
 * @author ：zx
 * @date ：Created in 2024/8/31 11:28
 * @description：
 * @modified By：
 * @version: $
 */
public interface ApprovalService {
    ResponseData<?> startApproval(CreditApplicationsDTO creditApplicationsDTO);
    ResponseData<?> clientManager();
    ResponseData<?> clientManagerApproval(String taskId, Integer flag);
    ResponseData<?> administrativePosition();
    ResponseData<?> administrativeApproval(String taskId, Integer flag);
    ResponseData<?> department(String assignee);
    ResponseData<?> departmentApproval(String taskId, Integer childrenFlag);
    ResponseData<?> clerk(String assignee);
    ResponseData<?> clerkApproval(Integer flag, String taskId);
    ResponseData<?> clientHistory();
    ResponseData<?> getDiagram(String processDefinitionId, String processInstanceId) throws IOException;
    ResponseData<?> getHistoricDetail(String processInstanceId);
}
