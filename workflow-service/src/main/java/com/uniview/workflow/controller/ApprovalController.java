package com.uniview.workflow.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.service.ApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

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
public class ApprovalController {

    @Autowired
    private ApprovalService approvalService;

    @GetMapping("/startApproval")
    public ResponseData<?> startApproval() {
        return approvalService.startApproval();
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

    @GetMapping("/administrativeApproval/{taskId}")
    public ResponseData<?> administrativeApproval(@PathVariable("taskId") String taskId) {
        return approvalService.administrativeApproval(taskId);
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
}
