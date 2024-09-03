package com.uniview.workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.flowable.engine.history.HistoricProcessInstance;

import java.util.Date;

/**
 * @author ：zx
 * @date ：Created in 2024/9/2 22:01
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HistoryDTO {
    private String historyId;
    private String processInstanceId;
    private String processDefinitionId;
    private Date startTime;
    private Date endTime;
    /**
     * 申请信息对象，暂时用TestDTO代替
     */
    private TestDTO info;

    public HistoryDTO(HistoricProcessInstance historicProcessInstance) {
        this.historyId = historicProcessInstance.getId();
        this.processInstanceId = historicProcessInstance.getId();
        this.processDefinitionId = historicProcessInstance.getProcessDefinitionId();
        this.startTime = historicProcessInstance.getStartTime();
        this.endTime = historicProcessInstance.getEndTime();
        this.info = (TestDTO) historicProcessInstance.getProcessVariables().get("info");
    }
}
