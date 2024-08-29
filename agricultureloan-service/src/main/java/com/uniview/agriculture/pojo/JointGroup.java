package com.uniview.agriculture.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

/**
 * 联保小组表
 * @TableName tb_joint_group
 */
@TableName(value ="tb_joint_group")
@Data
public class JointGroup implements Serializable {
    /**
     * 联保小组编号
     */
    @TableId
    private Long groupId;

    /**
     * 联保小组名称
     */
    private String groupName;

    /**
     * 联保组长客户编号
     */
    private Long leaderCustomerId;

    /**
     * 联保组长客户名称
     */
    private String leaderCustomerName;

    /**
     * 联保小组总额度
     */
    private BigDecimal totalCreditLimit;

    /**
     * 管户客户经理ID
     */
    private Long userId;

    /**
     * 管户网点
     */
    private String branch;

    /**
     * 登记日期
     */
    @JsonFormat(pattern = "yyyy年MM月dd日 HH时mm分ss秒")
    private Date creationDate;

    /**
     * 联保小组成员
     */
    private String MemberNames;

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
        JointGroup other = (JointGroup) that;
        return (this.getGroupId() == null ? other.getGroupId() == null : this.getGroupId().equals(other.getGroupId()))
            && (this.getGroupName() == null ? other.getGroupName() == null : this.getGroupName().equals(other.getGroupName()))
            && (this.getLeaderCustomerId() == null ? other.getLeaderCustomerId() == null : this.getLeaderCustomerId().equals(other.getLeaderCustomerId()))
            && (this.getLeaderCustomerName() == null ? other.getLeaderCustomerName() == null : this.getLeaderCustomerName().equals(other.getLeaderCustomerName()))
            && (this.getTotalCreditLimit() == null ? other.getTotalCreditLimit() == null : this.getTotalCreditLimit().equals(other.getTotalCreditLimit()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getBranch() == null ? other.getBranch() == null : this.getBranch().equals(other.getBranch()))
            && (this.getCreationDate() == null ? other.getCreationDate() == null : this.getCreationDate().equals(other.getCreationDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getGroupId() == null) ? 0 : getGroupId().hashCode());
        result = prime * result + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        result = prime * result + ((getLeaderCustomerId() == null) ? 0 : getLeaderCustomerId().hashCode());
        result = prime * result + ((getLeaderCustomerName() == null) ? 0 : getLeaderCustomerName().hashCode());
        result = prime * result + ((getTotalCreditLimit() == null) ? 0 : getTotalCreditLimit().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getBranch() == null) ? 0 : getBranch().hashCode());
        result = prime * result + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupId=").append(groupId);
        sb.append(", groupName=").append(groupName);
        sb.append(", leaderCustomerId=").append(leaderCustomerId);
        sb.append(", leaderCustomerName=").append(leaderCustomerName);
        sb.append(", totalCreditLimit=").append(totalCreditLimit);
        sb.append(", userId=").append(userId);
        sb.append(", branch=").append(branch);
        sb.append(", creationDate=").append(creationDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}