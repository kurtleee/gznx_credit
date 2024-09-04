package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 贷后回访主列表
 * @TableName postloan_followup_list
 */
@TableName(value ="postloan_followup_list")
@Data
public class PostloanFollowupList implements Serializable {
    /**
     * 任务编号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 客户号
     */
    private String customerNumber;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 证件类型
     */
    private String identityType;

    /**
     * 证件号码
     */
    private String identityNamber;

    /**
     * 结局金额
     */
    private String loanAmount;

    /**
     * 回访人
     */
    private String callbackPerson;

    /**
     * 任务生成时间
     */
    private Date taskStartTime;

    /**
     * 任务到期时间
     */
    private Date taskEndTime;

    /**
     * 登录时间
     */
    private Date registrationTime;

    /**
     * 任务状态
     */
    private String taskStatus;

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
        PostloanFollowupList other = (PostloanFollowupList) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCustomerNumber() == null ? other.getCustomerNumber() == null : this.getCustomerNumber().equals(other.getCustomerNumber()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getIdentityType() == null ? other.getIdentityType() == null : this.getIdentityType().equals(other.getIdentityType()))
            && (this.getIdentityNamber() == null ? other.getIdentityNamber() == null : this.getIdentityNamber().equals(other.getIdentityNamber()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getCallbackPerson() == null ? other.getCallbackPerson() == null : this.getCallbackPerson().equals(other.getCallbackPerson()))
            && (this.getTaskStartTime() == null ? other.getTaskStartTime() == null : this.getTaskStartTime().equals(other.getTaskStartTime()))
            && (this.getTaskEndTime() == null ? other.getTaskEndTime() == null : this.getTaskEndTime().equals(other.getTaskEndTime()))
            && (this.getRegistrationTime() == null ? other.getRegistrationTime() == null : this.getRegistrationTime().equals(other.getRegistrationTime()))
            && (this.getTaskStatus() == null ? other.getTaskStatus() == null : this.getTaskStatus().equals(other.getTaskStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCustomerNumber() == null) ? 0 : getCustomerNumber().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getIdentityType() == null) ? 0 : getIdentityType().hashCode());
        result = prime * result + ((getIdentityNamber() == null) ? 0 : getIdentityNamber().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getCallbackPerson() == null) ? 0 : getCallbackPerson().hashCode());
        result = prime * result + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        result = prime * result + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
        result = prime * result + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        result = prime * result + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", customerNumber=").append(customerNumber);
        sb.append(", customerName=").append(customerName);
        sb.append(", identityType=").append(identityType);
        sb.append(", identityNamber=").append(identityNamber);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", callbackPerson=").append(callbackPerson);
        sb.append(", taskStartTime=").append(taskStartTime);
        sb.append(", taskEndTime=").append(taskEndTime);
        sb.append(", registrationTime=").append(registrationTime);
        sb.append(", taskStatus=").append(taskStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}