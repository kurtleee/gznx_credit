package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName collection_record
 */
@TableName(value ="collection_record")
public class CollectionRecord implements Serializable {
    /**
     * 催收记录ID
     */
    @TableId(type = IdType.AUTO)
    private Long recordId;

    /**
     * 催收任务ID
     */
    private Long taskId;

    /**
     * 联系日期
     */
    private Date contactDate;

    /**
     * 联系方式
     */
    private String contactMethod;

    /**
     * 联系结果
     */
    private String contactResult;

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
     * 催收记录ID
     */
    public Long getRecordId() {
        return recordId;
    }

    /**
     * 催收记录ID
     */
    public void setRecordId(Long recordId) {
        this.recordId = recordId;
    }

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
     * 联系日期
     */
    public Date getContactDate() {
        return contactDate;
    }

    /**
     * 联系日期
     */
    public void setContactDate(Date contactDate) {
        this.contactDate = contactDate;
    }

    /**
     * 联系方式
     */
    public String getContactMethod() {
        return contactMethod;
    }

    /**
     * 联系方式
     */
    public void setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
    }

    /**
     * 联系结果
     */
    public String getContactResult() {
        return contactResult;
    }

    /**
     * 联系结果
     */
    public void setContactResult(String contactResult) {
        this.contactResult = contactResult;
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
        CollectionRecord other = (CollectionRecord) that;
        return (this.getRecordId() == null ? other.getRecordId() == null : this.getRecordId().equals(other.getRecordId()))
            && (this.getTaskId() == null ? other.getTaskId() == null : this.getTaskId().equals(other.getTaskId()))
            && (this.getContactDate() == null ? other.getContactDate() == null : this.getContactDate().equals(other.getContactDate()))
            && (this.getContactMethod() == null ? other.getContactMethod() == null : this.getContactMethod().equals(other.getContactMethod()))
            && (this.getContactResult() == null ? other.getContactResult() == null : this.getContactResult().equals(other.getContactResult()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getRecordId() == null) ? 0 : getRecordId().hashCode());
        result = prime * result + ((getTaskId() == null) ? 0 : getTaskId().hashCode());
        result = prime * result + ((getContactDate() == null) ? 0 : getContactDate().hashCode());
        result = prime * result + ((getContactMethod() == null) ? 0 : getContactMethod().hashCode());
        result = prime * result + ((getContactResult() == null) ? 0 : getContactResult().hashCode());
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
        sb.append(", recordId=").append(recordId);
        sb.append(", taskId=").append(taskId);
        sb.append(", contactDate=").append(contactDate);
        sb.append(", contactMethod=").append(contactMethod);
        sb.append(", contactResult=").append(contactResult);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}