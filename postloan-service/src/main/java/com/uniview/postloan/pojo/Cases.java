package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 案件信息表
 * @TableName cases
 */
@TableName(value ="cases")
@Data
public class Cases implements Serializable {
    /**
     * 案件ID，主键
     */
    @TableId
    private Integer caseId;

    /**
     * 案件编号
     */
    private String caseNumber;

    /**
     * 客户ID
     */
    private Integer customerId;

    /**
     * 案件详情
     */
    private String caseDetails;

    /**
     * 案件创建时间
     */
    private Date createdAt;

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
        Cases other = (Cases) that;
        return (this.getCaseId() == null ? other.getCaseId() == null : this.getCaseId().equals(other.getCaseId()))
            && (this.getCaseNumber() == null ? other.getCaseNumber() == null : this.getCaseNumber().equals(other.getCaseNumber()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCaseDetails() == null ? other.getCaseDetails() == null : this.getCaseDetails().equals(other.getCaseDetails()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        result = prime * result + ((getCaseNumber() == null) ? 0 : getCaseNumber().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCaseDetails() == null) ? 0 : getCaseDetails().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", caseId=").append(caseId);
        sb.append(", caseNumber=").append(caseNumber);
        sb.append(", customerId=").append(customerId);
        sb.append(", caseDetails=").append(caseDetails);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}