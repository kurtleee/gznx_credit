package com.uniview.agriculture.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 联保协议表
 * @TableName tb_joint_agreement
 */
@TableName(value ="tb_joint_agreement")
@Data
public class JointAgreement implements Serializable {
    /**
     * 协议编号
     */
    private String agreementId;

    /**
     * 联保小组编号
     */
    private String groupId;

    /**
     * 协议生效日期
     */
    private Date startDate;

    /**
     * 协议到期日期
     */
    private Date endDate;

    /**
     * 协议状态（1:未生效、2:正常、3:终止）
     */
    private Integer status;

    /**
     * 协议签订日期
     */
    private Date signDate;

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
        JointAgreement other = (JointAgreement) that;
        return (this.getAgreementId() == null ? other.getAgreementId() == null : this.getAgreementId().equals(other.getAgreementId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSignDate() == null ? other.getSignDate() == null : this.getSignDate().equals(other.getSignDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgreementId() == null) ? 0 : getAgreementId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSignDate() == null) ? 0 : getSignDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", agreementId=").append(agreementId);
        sb.append(", groupId=").append(groupId);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", status=").append(status);
        sb.append(", signDate=").append(signDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}