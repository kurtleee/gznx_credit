package com.uniview.agriculture.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 联保成员表
 * @TableName tb_joint_group_member
 */
@TableName(value ="tb_joint_group_member")
@Data
public class JointGroupMember implements Serializable {
    /**
     * 联保成员编号
     */
    @TableId(type = IdType.AUTO)
    private Long memberId;

    /**
     * 联保小组编号
     */
    private Long groupId;

    /**
     * 成员客户编号
     */
    private Long customerId;

    /**
     * 成员客户名称
     */
    private String customerName;

    /**
     * 证件号码
     */
    private String idNumber;

    /**
     * 联保贷款额度
     */
    private BigDecimal creditLimit;

    /**
     * 保证金缴存比例
     */
    private BigDecimal depositRatio;

    /**
     * 授信金额
     */
    private String depositAccount;

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
        JointGroupMember other = (JointGroupMember) that;
        return (this.getMemberId() == null ? other.getMemberId() == null : this.getMemberId().equals(other.getMemberId()))
            && (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getIdNumber() == null ? other.getIdNumber() == null : this.getIdNumber().equals(other.getIdNumber()))
            && (this.getCreditLimit() == null ? other.getCreditLimit() == null : this.getCreditLimit().equals(other.getCreditLimit()))
            && (this.getDepositRatio() == null ? other.getDepositRatio() == null : this.getDepositRatio().equals(other.getDepositRatio()))
            && (this.getDepositAccount() == null ? other.getDepositAccount() == null : this.getDepositAccount().equals(other.getDepositAccount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getMemberId() == null) ? 0 : getMemberId().hashCode());
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getIdNumber() == null) ? 0 : getIdNumber().hashCode());
        result = prime * result + ((getCreditLimit() == null) ? 0 : getCreditLimit().hashCode());
        result = prime * result + ((getDepositRatio() == null) ? 0 : getDepositRatio().hashCode());
        result = prime * result + ((getDepositAccount() == null) ? 0 : getDepositAccount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", memberId=").append(memberId);
        sb.append(", groupId=").append(groupId);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", creditLimit=").append(creditLimit);
        sb.append(", depositRatio=").append(depositRatio);
        sb.append(", depositAccount=").append(depositAccount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}