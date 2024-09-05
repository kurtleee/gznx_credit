package com.uniview.workflow.service.impl;

import com.uniview.common.utils.ResponseData;
import com.uniview.workflow.dto.CreditApplicationsDTO;
import com.uniview.workflow.dto.PostLoanDto;
import com.uniview.workflow.dto.TaskDTO;
import com.uniview.workflow.feign.ApplicationFeign;
import com.uniview.workflow.feign.PostLoanFeign;
import com.uniview.workflow.service.PostLoanService;
import org.flowable.engine.*;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class PostLoanServiceImpl implements PostLoanService {
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private PostLoanFeign postLoanFeign;

    @Override
    public ResponseData<?> startPostLoan(PostLoanDto postLoanDto) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("info", postLoanDto);
        runtimeService.startProcessInstanceByKey("postloan", variables);
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> clientManager() {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee("客户经理").includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> clientManagerPostLoan(String taskId, Integer flag) {
        //此处可以将flag改变状态，0则审批不通过
        if (flag == 0) {
            PostLoanDto info = runtimeService.getVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", PostLoanDto.class);
            info.setApprovalStatus("审批不通过");
            postLoanFeign.updateStatus(info);
            runtimeService.setVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", info);
        }
        taskService.complete(taskId);
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> networkManager() {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee("网点负责人").includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> networkManagerPostLoan(String taskId, Integer flag) {
        //此处可以将flag改变状态，0则审批不通过
        PostLoanDto info = runtimeService.getVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", PostLoanDto.class);
        if ("审批不通过".equals(info.getApprovalStatus())) {
            taskService.complete(taskId);
            return new ResponseData<>().success();
        }
        if (flag == 0) {
            info.setApprovalStatus("审批不通过");
            runtimeService.setVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", info);
            postLoanFeign.updateStatus(info);
        }
        taskService.complete(taskId);
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> department() {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee("行政负责人").includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> departmentPostLoan(String taskId, Integer flag) {
        PostLoanDto info = runtimeService.getVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", PostLoanDto.class);
        if ("审批不通过".equals(info.getApprovalStatus())) {
            taskService.complete(taskId);
            return new ResponseData<>().success();
        }
        //此处可以将flag改变状态，0则审批不通过
        if (flag == 0) {
            info.setApprovalStatus("审批不通过");
            runtimeService.setVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", info);
            postLoanFeign.updateStatus(info);
        }else if(flag == 1){
            info.setApprovalStatus("审批通过");
            postLoanFeign.updateStatus(info);
        }
        taskService.complete(taskId);
        return new ResponseData<>().success();
    }
}
