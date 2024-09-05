package com.uniview.workflow.service.impl;

import com.uniview.common.utils.ResponseData;
import com.uniview.common.utils.ResponseEnum;
import com.uniview.workflow.dto.HistoryDTO;
import com.uniview.workflow.dto.TaskDTO;
import com.uniview.workflow.dto.CreditApplicationsDTO;
import com.uniview.workflow.feign.ApplicationFeign;
import com.uniview.workflow.service.ApprovalService;
import org.flowable.bpmn.model.BpmnModel;
import org.flowable.engine.*;
import org.flowable.engine.history.HistoricProcessInstance;
import org.flowable.image.ProcessDiagramGenerator;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.*;
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
    @Autowired
    private HistoryService historyService;
    @Autowired
    private ProcessEngine processEngine;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private ApplicationFeign applicationFeign;

    @Override
    public ResponseData<?> startApproval(CreditApplicationsDTO applicationsDTO) {
        Map<String, Object> variables = new HashMap<>();
        variables.put("flag", 1);
        variables.put("childrenFlag", 1);
        variables.put("info", applicationsDTO);
        runtimeService.startProcessInstanceByKey("gznx", variables);
        return new ResponseData<>().success();
    }

    /**
     * 客户经理节点下的待审批任务
     * @return
     */
    @Override
    public ResponseData<?> clientManager() {
        List<Task> taskList = taskService.createTaskQuery().taskAssignee("客户经理").includeProcessVariables().list();
        List<TaskDTO> taskDTOList = taskList.stream().map(TaskDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(taskDTOList);
    }

    @Override
    public ResponseData<?> clientManagerApproval(String taskId, Integer flag) {
        //此处可以将flag改变状态，0则审批不通过
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
    public ResponseData<?> administrativeApproval(String taskId, Integer flag) {
        runtimeService.setVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "flag", flag);
        if (flag == 0) {
            // 修改申请信息对象的审批状态字段
            CreditApplicationsDTO info = runtimeService.getVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", CreditApplicationsDTO.class);
            info.setApprovalStatus(0);
            applicationFeign.updateStatus(info);
            taskService.complete(taskId);
            return new ResponseData<>().fail(ResponseEnum.DISAPPROVAL);
        } else if (flag == 1) {
            taskService.complete(taskId);
            return new ResponseData<>().success();
        } else if (flag == 2) {
            taskService.complete(taskId);
            return new ResponseData<>().success();
        } else if (flag == 3) {
            taskService.complete(taskId);
            return new ResponseData<>().success();
        }
        taskService.complete(taskId);
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
        if (childrenFlag == 0) {
            // 修改申请信息对象的审批状态字段
            CreditApplicationsDTO info = runtimeService.getVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", CreditApplicationsDTO.class);
            info.setApprovalStatus(0);
            applicationFeign.updateStatus(info);
            taskService.complete(taskId);
            return new ResponseData<>().fail(ResponseEnum.DISAPPROVAL);
        }
        taskService.complete(taskId);
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
        // 根据flag改变申请信息中的审批状态字段，1为通过，0不通过
        CreditApplicationsDTO info = runtimeService.getVariable(taskService.createTaskQuery().taskId(taskId).singleResult().getExecutionId(), "info", CreditApplicationsDTO.class);
        info.setApprovalStatus(flag);
        applicationFeign.updateStatus(info);
        taskService.complete(taskId);
        return new ResponseData<>().success();
    }

    @Override
    public ResponseData<?> clientHistory() {
        List<HistoricProcessInstance> historicList = historyService.createHistoricProcessInstanceQuery().includeProcessVariables().list();
        List<HistoryDTO> historyDTOList = historicList.stream().map(HistoryDTO::new).collect(Collectors.toList());
        return new ResponseData<>().success(historyDTOList);
    }

    @Override
    public ResponseData<?> getDiagram(String processDefinitionId, String processInstanceId) throws IOException {
        List<String> activeActivityIds = runtimeService.getActiveActivityIds(processInstanceId);
        BpmnModel bpmnModel = repositoryService.getBpmnModel(processDefinitionId);
        ProcessDiagramGenerator diagramGenerator = processEngine.getProcessEngineConfiguration().getProcessDiagramGenerator();
        InputStream diagram = diagramGenerator.generateDiagram(
                bpmnModel,
                "png",
                activeActivityIds,
                Collections.emptyList(),
                processEngine.getProcessEngineConfiguration().getActivityFontName(),
                processEngine.getProcessEngineConfiguration().getLabelFontName(),
                processEngine.getProcessEngineConfiguration().getAnnotationFontName(),
                processEngine.getProcessEngineConfiguration().getClassLoader(),
                1.0,
                true
        );
        File file = new File("E:\\WeChatProjects\\miniprogram-6\\images\\process.png");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = diagram.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
            fileOutputStream.write(buffer, 0, bytesRead);
        }
        byte[] imageBytes = outputStream.toByteArray();
        String imageBase64 = Base64.getEncoder().encodeToString(imageBytes);
        return new ResponseData<>().success(imageBase64);
    }

    @Override
    public ResponseData<?> getHistoricDetail(String processInstanceId) {
        HistoricProcessInstance historicProcessInstance = historyService.createHistoricProcessInstanceQuery().includeProcessVariables().processInstanceId(processInstanceId).singleResult();
        HistoryDTO historyDTO = new HistoryDTO(historicProcessInstance);
        return new ResponseData<>().success(historyDTO);
    }
}
