package com.uniview.workflow.service.impl;

import com.uniview.common.utils.ResponseData;
import com.uniview.common.utils.ResponseEnum;
import com.uniview.workflow.dto.TaskDTO;
import com.uniview.workflow.service.ApprovalService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ：zx
 * @date ：Created in 2024/8/31 11:30
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class ApprovalServiceImpl implements ApprovalService {

    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Override
    public ResponseData<?> startApproval() {
        Map<String, Object> variables = new HashMap<>();
        variables.put("flag", 0);
        variables.put("childrenFlag", 0);
        variables.put("info","此处填入客户的申请信息对象");
        runtimeService.startProcessInstanceByKey("gznx", variables);
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> clientManager() {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee("客户经理").includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> clientManagerApproval(String taskId, Integer flag) {
        //此处可以将flag改变状态，0则审批不通过，流程中止，否则根据路由规则流向其他流程（flag=1或2或3）
        runtimeService.setVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "flag", flag);
        taskService.complete(taskId);
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> administrativePosition() {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee("行政专职审批").includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> administrativeApproval(String taskId) {
        Integer flag = runtimeService.getVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "flag", Integer.class);
        taskService.complete(taskId);
        if (flag == 0) {
            // 修改申请信息对象的审批状态字段
            return new ResponseData<>().fail(ResponseEnum.DISAPPROVAL);
        } else if (flag == 1) {
            return new ResponseData<>().success();
        } else if (flag == 2) {
            return new ResponseData<>().success();
        } else if (flag == 3) {
            return new ResponseData<>().success();
        }
        return new ResponseData<>().fail(ResponseEnum.FAIL);
    }

    @Override
    public ResponseData<?> department(String assignee) {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee(assignee).includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> departmentApproval(String taskId, Integer childrenFlag) {
        runtimeService.setVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "childrenFlag", childrenFlag);
        taskService.complete(taskId);
        if (childrenFlag == 0) {
            // 修改申请信息对象的审批状态字段
            return new ResponseData<>().fail(ResponseEnum.DISAPPROVAL);
        }
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> clerk(String assignee) {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee(assignee).includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> clerkApproval(Integer flag, String taskId) {
        // 根据flag改变申请信息中的审批状态字段
        taskService.complete(taskId);
        return new ResponseData<>().success();
    }
}
