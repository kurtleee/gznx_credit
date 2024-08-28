package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName collection_task
 */
@TableName(value ="collection_task")
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
     * 催收类型
     */
    private String taskType;

    /**
     * 催收状态
     */
    private String taskStatus;

    /**
     * 分配给客户经理
     */
    private Long assignedTo;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 催收任务ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 催收任务ID
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 贷款ID
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * 贷款ID
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    /**
     * 催收类型
     */
    public String getTaskType() {
        return taskType;
    }

    /**
     * 催收类型
     */
    public void setTaskType(String taskType) {
        this.taskType = taskType;
    }

    /**
     * 催收状态
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    /**
     * 催收状态
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * 分配给客户经理
     */
    public Long getAssignedTo() {
        return assignedTo;
    }

    /**
     * 分配给客户经理
     */
    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    /**
     * 任务截止日期
     */
    public Date getDueDate() {
        return dueDate;
    }

    /**
     * 任务截止日期
     */
    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    /**
     * 创建时间
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     * 创建时间
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * 更新时间
     */
    public Date getUpdatedAt() {
        return updatedAt;
    }

    /**
     * 更新时间
     */
    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

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
            && (this.getAssignedTo() == null ? other.getAssignedTo() == null : this.getAssignedTo().equals(other.getAssignedTo()))
            && (this.getDueDate() == null ? other.getDueDate() == null : this.getDueDate().equals(other.getDueDate()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        result = prime * result + ((getAssignedTo() == null) ? 0 : getAssignedTo().hashCode());
        result = prime * result + ((getDueDate() == null) ? 0 : getDueDate().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        result = prime * result + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
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
        sb.append(", assignedTo=").append(assignedTo);
        sb.append(", dueDate=").append(dueDate);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}