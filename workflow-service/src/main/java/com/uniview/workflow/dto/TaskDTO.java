package com.uniview.workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.flowable.job.api.HistoryJob;
import org.flowable.task.api.Task;

import java.util.Map;

/**
 * @author ：zx
 * @date ：Created in 2024/8/31 12:37
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    private String taskId;
    private Map<String, Object> processVariables;
    public TaskDTO(Task task){
        this.taskId = task.getId();
        this.processVariables = task.getProcessVariables();
    }
}
