package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 催收记录
 * @TableName collection_record
 */
@TableName(value ="collection_record")
@Data
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
    /**
     * 客户Id
     */
    private Long customerId;

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