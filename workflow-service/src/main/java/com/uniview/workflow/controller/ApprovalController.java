package com.uniview.workflow.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.dto.CreditApplicationsDTO;
import com.uniview.workflow.service.ApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author ：zx
 * @date ：Created in 2024/8/29 15:35
 * @description： 流程开始时将客户的申请信息作为流程变量放入流程定义中，
 * 显示到各个审批人的前端，申请信息中应该有一个审批状态字段，默认为通过，
 * 当审批不通过时该任务节点应该将该字段改为不通过
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/personal")
public class ApprovalController {

    @Autowired
    private ApprovalService approvalService;

    @PostMapping("/startApproval")
    public ResponseData<?> startApproval(@RequestBody CreditApplicationsDTO creditApplicationsDTO) {
        return approvalService.startApproval(creditApplicationsDTO);
    }

    @GetMapping("/clientManager")
    public ResponseData<?> clientManager() {
        return approvalService.clientManager();
    }

    @GetMapping("/clientManagerApproval/{taskId}/{flag}")
    public ResponseData<?> clientManagerApproval(@PathVariable("taskId") String taskId, @PathVariable("flag") Integer flag) {
        return approvalService.clientManagerApproval(taskId, flag);
    }

    @GetMapping("/administrativePosition")
    public ResponseData<?> administrativePosition() {
        return approvalService.administrativePosition();
    }

    @GetMapping("/administrativeApproval/{taskId}/{flag}")
    public ResponseData<?> administrativeApproval(@PathVariable("taskId") String taskId, @PathVariable("flag") Integer flag) {
        return approvalService.administrativeApproval(taskId, flag);
    }

    @GetMapping("/department/{assignee}")
    public ResponseData<?> department(@PathVariable("assignee") String assignee) {
        return approvalService.department(assignee);
    }

    @GetMapping("/departmentApproval/{taskId}/{childrenFlag}")
    public ResponseData<?> departmentApproval(@PathVariable("taskId") String taskId, @PathVariable("childrenFlag") Integer childrenFlag) {
        return approvalService.departmentApproval(taskId, childrenFlag);
    }

    @GetMapping("/clerk/{assignee}")
    public ResponseData<?> clerk(@PathVariable("assignee") String assignee) {
        return approvalService.clerk(assignee);
    }

    @GetMapping("/clerkApproval/{flag}/{taskId}")
    public ResponseData<?> clerkApproval(@PathVariable("flag") Integer flag, @PathVariable("taskId") String taskId) {
        return approvalService.clerkApproval(flag, taskId);
    }

    @GetMapping("/clientHistory")
    public ResponseData<?> clientHistory() {
        return approvalService.clientHistory();
    }

    @GetMapping("/getDiagram/{processDefinitionId}/{processInstanceId}")
    public ResponseData<?> getDiagram(@PathVariable("processDefinitionId") String processDefinitionId, @PathVariable("processInstanceId") String processInstanceId) throws IOException {
        return approvalService.getDiagram(processDefinitionId, processInstanceId);
    }
    @GetMapping("/getHistoricDetail/{processInstanceId}")
    public ResponseData<?> getHistoricDetail(@PathVariable("processInstanceId") String processInstanceId){
        return approvalService.getHistoricDetail(processInstanceId);
    }
}
