package com.uniview.agriculture.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName credit_applications
 */
@TableName(value ="credit_applications")
public class CreditApplications implements Serializable {
    /**
     * 申请编号
     */
    @TableId(type = IdType.AUTO)
    private Integer applicationId;

    /**
     * 进件编号
     */
    private String entryId;

    /**
     * 客户号
     */
    private Integer clientNumber;

    /**
     * 产品号
     */
    private Integer productName;

    /**
     * 信用等级
     */
    private Integer creditRating;

    /**
     * 授信金额 (元)
     */
    private BigDecimal creditAmount;

    /**
     * 授信有效期 (月)
     */
    private Integer creditValidityPeriod;

    /**
     * 授信生效日
     */
    private Date creditEffectiveDate;

    /**
     * 贷款金额(元)
     */
    private BigDecimal loanAmount;

    /**
     * 期限类型
     */
    private Integer termType;

    /**
     * 贷款期限
     */
    private Integer loanTerm;

    /**
     * 客户经理
     */
    private Integer clientManager;

    /**
     * 申请日期
     */
    private Date applicationDate;

    /**
     * 主管网点
     */
    private Integer mainNetPoint;

    /**
     * 审批状态
     */
    private Integer approvalStatus;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 申请编号
     */
    public Integer getApplicationId() {
        return applicationId;
    }

    /**
     * 申请编号
     */
    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    /**
     * 进件编号
     */
    public String getEntryId() {
        return entryId;
    }

    /**
     * 进件编号
     */
    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    /**
     * 客户号
     */
    public Integer getClientNumber() {
        return clientNumber;
    }

    /**
     * 客户号
     */
    public void setClientNumber(Integer clientNumber) {
        this.clientNumber = clientNumber;
    }

    /**
     * 产品号
     */
    public Integer getProductName() {
        return productName;
    }

    /**
     * 产品号
     */
    public void setProductName(Integer productName) {
        this.productName = productName;
    }

    /**
     * 信用等级
     */
    public Integer getCreditRating() {
        return creditRating;
    }

    /**
     * 信用等级
     */
    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }

    /**
     * 授信金额 (元)
     */
    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    /**
     * 授信金额 (元)
     */
    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    /**
     * 授信有效期 (月)
     */
    public Integer getCreditValidityPeriod() {
        return creditValidityPeriod;
    }

    /**
     * 授信有效期 (月)
     */
    public void setCreditValidityPeriod(Integer creditValidityPeriod) {
        this.creditValidityPeriod = creditValidityPeriod;
    }

    /**
     * 授信生效日
     */
    public Date getCreditEffectiveDate() {
        return creditEffectiveDate;
    }

    /**
     * 授信生效日
     */
    public void setCreditEffectiveDate(Date creditEffectiveDate) {
        this.creditEffectiveDate = creditEffectiveDate;
    }

    /**
     * 贷款金额(元)
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * 贷款金额(元)
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 期限类型
     */
    public Integer getTermType() {
        return termType;
    }

    /**
     * 期限类型
     */
    public void setTermType(Integer termType) {
        this.termType = termType;
    }

    /**
     * 贷款期限
     */
    public Integer getLoanTerm() {
        return loanTerm;
    }

    /**
     * 贷款期限
     */
    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * 客户经理
     */
    public Integer getClientManager() {
        return clientManager;
    }

    /**
     * 客户经理
     */
    public void setClientManager(Integer clientManager) {
        this.clientManager = clientManager;
    }

    /**
     * 申请日期
     */
    public Date getApplicationDate() {
        return applicationDate;
    }

    /**
     * 申请日期
     */
    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    /**
     * 主管网点
     */
    public Integer getMainNetPoint() {
        return mainNetPoint;
    }

    /**
     * 主管网点
     */
    public void setMainNetPoint(Integer mainNetPoint) {
        this.mainNetPoint = mainNetPoint;
    }

    /**
     * 审批状态
     */
    public Integer getApprovalStatus() {
        return approvalStatus;
    }

    /**
     * 审批状态
     */
    public void setApprovalStatus(Integer approvalStatus) {
        this.approvalStatus = approvalStatus;
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
        CreditApplications other = (CreditApplications) that;
        return (this.getApplicationId() == null ? other.getApplicationId() == null : this.getApplicationId().equals(other.getApplicationId()))
            && (this.getEntryId() == null ? other.getEntryId() == null : this.getEntryId().equals(other.getEntryId()))
            && (this.getClientNumber() == null ? other.getClientNumber() == null : this.getClientNumber().equals(other.getClientNumber()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getCreditRating() == null ? other.getCreditRating() == null : this.getCreditRating().equals(other.getCreditRating()))
            && (this.getCreditAmount() == null ? other.getCreditAmount() == null : this.getCreditAmount().equals(other.getCreditAmount()))
            && (this.getCreditValidityPeriod() == null ? other.getCreditValidityPeriod() == null : this.getCreditValidityPeriod().equals(other.getCreditValidityPeriod()))
            && (this.getCreditEffectiveDate() == null ? other.getCreditEffectiveDate() == null : this.getCreditEffectiveDate().equals(other.getCreditEffectiveDate()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getTermType() == null ? other.getTermType() == null : this.getTermType().equals(other.getTermType()))
            && (this.getLoanTerm() == null ? other.getLoanTerm() == null : this.getLoanTerm().equals(other.getLoanTerm()))
            && (this.getClientManager() == null ? other.getClientManager() == null : this.getClientManager().equals(other.getClientManager()))
            && (this.getApplicationDate() == null ? other.getApplicationDate() == null : this.getApplicationDate().equals(other.getApplicationDate()))
            && (this.getMainNetPoint() == null ? other.getMainNetPoint() == null : this.getMainNetPoint().equals(other.getMainNetPoint()))
            && (this.getApprovalStatus() == null ? other.getApprovalStatus() == null : this.getApprovalStatus().equals(other.getApprovalStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getApplicationId() == null) ? 0 : getApplicationId().hashCode());
        result = prime * result + ((getEntryId() == null) ? 0 : getEntryId().hashCode());
        result = prime * result + ((getClientNumber() == null) ? 0 : getClientNumber().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getCreditRating() == null) ? 0 : getCreditRating().hashCode());
        result = prime * result + ((getCreditAmount() == null) ? 0 : getCreditAmount().hashCode());
        result = prime * result + ((getCreditValidityPeriod() == null) ? 0 : getCreditValidityPeriod().hashCode());
        result = prime * result + ((getCreditEffectiveDate() == null) ? 0 : getCreditEffectiveDate().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getTermType() == null) ? 0 : getTermType().hashCode());
        result = prime * result + ((getLoanTerm() == null) ? 0 : getLoanTerm().hashCode());
        result = prime * result + ((getClientManager() == null) ? 0 : getClientManager().hashCode());
        result = prime * result + ((getApplicationDate() == null) ? 0 : getApplicationDate().hashCode());
        result = prime * result + ((getMainNetPoint() == null) ? 0 : getMainNetPoint().hashCode());
        result = prime * result + ((getApprovalStatus() == null) ? 0 : getApprovalStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", applicationId=").append(applicationId);
        sb.append(", entryId=").append(entryId);
        sb.append(", clientNumber=").append(clientNumber);
        sb.append(", productName=").append(productName);
        sb.append(", creditRating=").append(creditRating);
        sb.append(", creditAmount=").append(creditAmount);
        sb.append(", creditValidityPeriod=").append(creditValidityPeriod);
        sb.append(", creditEffectiveDate=").append(creditEffectiveDate);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", termType=").append(termType);
        sb.append(", loanTerm=").append(loanTerm);
        sb.append(", clientManager=").append(clientManager);
        sb.append(", applicationDate=").append(applicationDate);
        sb.append(", mainNetPoint=").append(mainNetPoint);
        sb.append(", approvalStatus=").append(approvalStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}