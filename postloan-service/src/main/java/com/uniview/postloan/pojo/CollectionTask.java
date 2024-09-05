package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 催收任务
 * @TableName collection_task
 */
@TableName(value ="collection_task")
@Data
public class CollectionTask implements Serializable {
    /**
     * 催收任务ID
     */
    @TableId(type = IdType.AUTO)
    private Long taskId;

    /**
     * 贷款ID
     */
    private Long loanId;

    /**
     * 催收类型（1：轻度逾期，2：中度逾期、3:重度逾期）
     */
    private String taskType;

    /**
     * 催收状态（1：待催收，2：催收中、3:催收完成）
     */
    private String taskStatus;

    /**
     * 任务截止日期
     */
    private Date dueDate;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

    /**
     * 网点id
     */
    private Integer mainNetPointId;

    /**
     * 催收方式：1:短信/电子邮件、2：电话、3：自动扣款、4：上门访问、5：诉讼
     */
    private String taskMethods;

    /**
     * 到期前天数（到期倒计时）
     */
    private Integer daysBeforeDue;

    /**
     * 逾期起始天数
     */
    private Integer overdueStartDays;

    /**
     * 规则状态（1：生效、2：失效）
     */
    private Integer ruleStatus;

    /**
     * 更新人Id
     */
    private Long userId;

    /**
     * 规则编号
     */
    private String ruleNumber;

    /**
     * 逾期截止天数
     */
    private Long overdueCutoffDays;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CollectionTask other = (CollectionTask) that;
        return (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getTaskStatus() == null ? other.getTaskStatus() == null : this.getTaskStatus().equals(other.getTaskStatus()))
            && (this.getDueDate() == null ? other.getDueDate() == null : this.getDueDate().equals(other.getDueDate()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()))
            && (this.getMainNetPointId() == null ? other.getMainNetPointId() == null : this.getMainNetPointId().equals(other.getMainNetPointId()))
            && (this.getTaskMethods() == null ? other.getTaskMethods() == null : this.getTaskMethods().equals(other.getTaskMethods()))
            && (this.getDaysBeforeDue() == null ? other.getDaysBeforeDue() == null : this.getDaysBeforeDue().equals(other.getDaysBeforeDue()))
            && (this.getOverdueStartDays() == null ? other.getOverdueStartDays() == null : this.getOverdueStartDays().equals(other.getOverdueStartDays()))
            && (this.getRuleStatus() == null ? other.getRuleStatus() == null : this.getRuleStatus().equals(other.getRuleStatus()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getRuleNumber() == null ? other.getRuleNumber() == null : this.getRuleNumber().equals(other.getRuleNumber()))
            && (this.getOverdueCutoffDays() == null ? other.getOverdueCutoffDays() == null : this.getOverdueCutoffDays().equals(other.getOverdueCutoffDays()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        result = prime * result + ((getDueDate() == null) ? 0 : getDueDate().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        result = prime * result + ((getMainNetPointId() == null) ? 0 : getMainNetPointId().hashCode());
        result = prime * result + ((getTaskMethods() == null) ? 0 : getTaskMethods().hashCode());
        result = prime * result + ((getDaysBeforeDue() == null) ? 0 : getDaysBeforeDue().hashCode());
        result = prime * result + ((getOverdueStartDays() == null) ? 0 : getOverdueStartDays().hashCode());
        result = prime * result + ((getRuleStatus() == null) ? 0 : getRuleStatus().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        result = prime * result + ((getOverdueCutoffDays() == null) ? 0 : getOverdueCutoffDays().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", taskId=").append(taskId);
        sb.append(", loanId=").append(loanId);
        sb.append(", taskType=").append(taskType);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", mainNetPointId=").append(mainNetPointId);
        sb.append(", taskMethods=").append(taskMethods);
        sb.append(", daysBeforeDue=").append(daysBeforeDue);
        sb.append(", overdueStartDays=").append(overdueStartDays);
        sb.append(", ruleStatus=").append(ruleStatus);
        sb.append(", userId=").append(userId);
        sb.append(", ruleNumber=").append(ruleNumber);
        sb.append(", overdueCutoffDays=").append(overdueCutoffDays);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}