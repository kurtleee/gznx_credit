package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 贷后回访详情表
 * @TableName postloan_callback_detail
 */
@TableName(value ="postloan_callback_detail")
@Data
public class PostloanCallbackDetail implements Serializable {
    /**
     * 序号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 任务编号
     */
    private String taskNamber;

    /**
     * 合同号
     */
    private String contractNumber;

    /**
     * 借据号
     */
    private String loanNumber;

    /**
     * 客户号
     */
    private Integer customerNumber;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 借据开始日期
     */
    private Date loanStartTime;

    /**
     * 借据结束日期
     */
    private Date loanEndTime;

    /**
     * 借据金额
     */
    private String loanAmount;

    /**
     * 贷款用途
     */
    private String loanPurpose;

    /**
     * 贷款是否本人使用（1：是，2：否）
     */
    private Integer selfUseWhether;

    /**
     * 贷款用途是否真实（1：是，2：否）
     */
    private String purposeWhether;

    /**
     * 是否假冒名贷款（1：是，2：否）
     */
    private String nameWherther;

    /**
     * 其他说明
     */
    private String ortherDescription;

    /**
     * 任务生成时间
     */
    private Date taskStartTime;

    /**
     * 任务到期时间
     */
    private Date taskEndTime;

    /**
     * 登记时间
     */
    private Date registrationTime;

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
        PostloanCallbackDetail other = (PostloanCallbackDetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTaskNamber() == null ? other.getTaskNamber() == null : this.getTaskNamber().equals(other.getTaskNamber()))
            && (this.getContractNumber() == null ? other.getContractNumber() == null : this.getContractNumber().equals(other.getContractNumber()))
            && (this.getLoanNumber() == null ? other.getLoanNumber() == null : this.getLoanNumber().equals(other.getLoanNumber()))
            && (this.getCustomerNumber() == null ? other.getCustomerNumber() == null : this.getCustomerNumber().equals(other.getCustomerNumber()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getLoanStartTime() == null ? other.getLoanStartTime() == null : this.getLoanStartTime().equals(other.getLoanStartTime()))
            && (this.getLoanEndTime() == null ? other.getLoanEndTime() == null : this.getLoanEndTime().equals(other.getLoanEndTime()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getLoanPurpose() == null ? other.getLoanPurpose() == null : this.getLoanPurpose().equals(other.getLoanPurpose()))
            && (this.getSelfUseWhether() == null ? other.getSelfUseWhether() == null : this.getSelfUseWhether().equals(other.getSelfUseWhether()))
            && (this.getPurposeWhether() == null ? other.getPurposeWhether() == null : this.getPurposeWhether().equals(other.getPurposeWhether()))
            && (this.getNameWherther() == null ? other.getNameWherther() == null : this.getNameWherther().equals(other.getNameWherther()))
            && (this.getOrtherDescription() == null ? other.getOrtherDescription() == null : this.getOrtherDescription().equals(other.getOrtherDescription()))
            && (this.getTaskStartTime() == null ? other.getTaskStartTime() == null : this.getTaskStartTime().equals(other.getTaskStartTime()))
            && (this.getTaskEndTime() == null ? other.getTaskEndTime() == null : this.getTaskEndTime().equals(other.getTaskEndTime()))
            && (this.getRegistrationTime() == null ? other.getRegistrationTime() == null : this.getRegistrationTime().equals(other.getRegistrationTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTaskNamber() == null) ? 0 : getTaskNamber().hashCode());
        result = prime * result + ((getContractNumber() == null) ? 0 : getContractNumber().hashCode());
        result = prime * result + ((getLoanNumber() == null) ? 0 : getLoanNumber().hashCode());
        result = prime * result + ((getCustomerNumber() == null) ? 0 : getCustomerNumber().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getLoanStartTime() == null) ? 0 : getLoanStartTime().hashCode());
        result = prime * result + ((getLoanEndTime() == null) ? 0 : getLoanEndTime().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getLoanPurpose() == null) ? 0 : getLoanPurpose().hashCode());
        result = prime * result + ((getSelfUseWhether() == null) ? 0 : getSelfUseWhether().hashCode());
        result = prime * result + ((getPurposeWhether() == null) ? 0 : getPurposeWhether().hashCode());
        result = prime * result + ((getNameWherther() == null) ? 0 : getNameWherther().hashCode());
        result = prime * result + ((getOrtherDescription() == null) ? 0 : getOrtherDescription().hashCode());
        result = prime * result + ((getTaskStartTime() == null) ? 0 : getTaskStartTime().hashCode());
        result = prime * result + ((getTaskEndTime() == null) ? 0 : getTaskEndTime().hashCode());
        result = prime * result + ((getRegistrationTime() == null) ? 0 : getRegistrationTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", taskNamber=").append(taskNamber);
        sb.append(", contractNumber=").append(contractNumber);
        sb.append(", loanNumber=").append(loanNumber);
        sb.append(", customerNumber=").append(customerNumber);
        sb.append(", customerName=").append(customerName);
        sb.append(", productName=").append(productName);
        sb.append(", loanStartTime=").append(loanStartTime);
        sb.append(", loanEndTime=").append(loanEndTime);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", loanPurpose=").append(loanPurpose);
        sb.append(", selfUseWhether=").append(selfUseWhether);
        sb.append(", purposeWhether=").append(purposeWhether);
        sb.append(", nameWherther=").append(nameWherther);
        sb.append(", ortherDescription=").append(ortherDescription);
        sb.append(", taskStartTime=").append(taskStartTime);
        sb.append(", taskEndTime=").append(taskEndTime);
        sb.append(", registrationTime=").append(registrationTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}