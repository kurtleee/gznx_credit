package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 诉讼管理表
 * @TableName litigation_management
 */
@TableName(value ="litigation_management")
@Data
public class LitigationManagement implements Serializable {
    /**
     * 诉讼ID，主键
     */
    @TableId
    private Integer litigationId;

    /**
     * 案件ID，外键
     */
    private Integer caseId;

    /**
     * 诉讼状态
     */
    private String litigationStatus;

    /**
     * 诉讼发起日期
     */
    private Date initiatedDate;

    /**
     * 诉讼失效日期
     */
    private Date expirationDate;
    /**
     * customer_id
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
        LitigationManagement other = (LitigationManagement) that;
        return (this.getLitigationId() == null ? other.getLitigationId() == null : this.getLitigationId().equals(other.getLitigationId()))
            && (this.getCaseId() == null ? other.getCaseId() == null : this.getCaseId().equals(other.getCaseId()))
            && (this.getLitigationStatus() == null ? other.getLitigationStatus() == null : this.getLitigationStatus().equals(other.getLitigationStatus()))
            && (this.getInitiatedDate() == null ? other.getInitiatedDate() == null : this.getInitiatedDate().equals(other.getInitiatedDate()))
            && (this.getExpirationDate() == null ? other.getExpirationDate() == null : this.getExpirationDate().equals(other.getExpirationDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLitigationId() == null) ? 0 : getLitigationId().hashCode());
        result = prime * result + ((getCaseId() == null) ? 0 : getCaseId().hashCode());
        result = prime * result + ((getLitigationStatus() == null) ? 0 : getLitigationStatus().hashCode());
        result = prime * result + ((getInitiatedDate() == null) ? 0 : getInitiatedDate().hashCode());
        result = prime * result + ((getExpirationDate() == null) ? 0 : getExpirationDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", litigationId=").append(litigationId);
        sb.append(", caseId=").append(caseId);
        sb.append(", litigationStatus=").append(litigationStatus);
        sb.append(", initiatedDate=").append(initiatedDate);
        sb.append(", expirationDate=").append(expirationDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}