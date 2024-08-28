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
 * @TableName agriculture_loan
 */
@TableName(value ="agriculture_loan")
public class AgricultureLoan implements Serializable {
    /**
     * 农贷业务ID
     */
    @TableId(type = IdType.AUTO)
    private Long agricultureLoanId;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 贷款金额
     */
    private BigDecimal loanAmount;

    /**
     * 贷款期限(月)
     */
    private Integer loanTerm;

    /**
     * 贷款开始日期
     */
    private Date loanStartDate;

    /**
     * 贷款结束日期
     */
    private Date loanEndDate;

    /**
     * 担保类型
     */
    private String collateralType;

    /**
     * 贷款状态
     */
    private String loanStatus;

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
     * 农贷业务ID
     */
    public Long getAgricultureLoanId() {
        return agricultureLoanId;
    }

    /**
     * 农贷业务ID
     */
    public void setAgricultureLoanId(Long agricultureLoanId) {
        this.agricultureLoanId = agricultureLoanId;
    }

    /**
     * 客户ID
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 客户ID
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 贷款金额
     */
    public BigDecimal getLoanAmount() {
        return loanAmount;
    }

    /**
     * 贷款金额
     */
    public void setLoanAmount(BigDecimal loanAmount) {
        this.loanAmount = loanAmount;
    }

    /**
     * 贷款期限(月)
     */
    public Integer getLoanTerm() {
        return loanTerm;
    }

    /**
     * 贷款期限(月)
     */
    public void setLoanTerm(Integer loanTerm) {
        this.loanTerm = loanTerm;
    }

    /**
     * 贷款开始日期
     */
    public Date getLoanStartDate() {
        return loanStartDate;
    }

    /**
     * 贷款开始日期
     */
    public void setLoanStartDate(Date loanStartDate) {
        this.loanStartDate = loanStartDate;
    }

    /**
     * 贷款结束日期
     */
    public Date getLoanEndDate() {
        return loanEndDate;
    }

    /**
     * 贷款结束日期
     */
    public void setLoanEndDate(Date loanEndDate) {
        this.loanEndDate = loanEndDate;
    }

    /**
     * 担保类型
     */
    public String getCollateralType() {
        return collateralType;
    }

    /**
     * 担保类型
     */
    public void setCollateralType(String collateralType) {
        this.collateralType = collateralType;
    }

    /**
     * 贷款状态
     */
    public String getLoanStatus() {
        return loanStatus;
    }

    /**
     * 贷款状态
     */
    public void setLoanStatus(String loanStatus) {
        this.loanStatus = loanStatus;
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
        AgricultureLoan other = (AgricultureLoan) that;
        return (this.getAgricultureLoanId() == null ? other.getAgricultureLoanId() == null : this.getAgricultureLoanId().equals(other.getAgricultureLoanId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getLoanTerm() == null ? other.getLoanTerm() == null : this.getLoanTerm().equals(other.getLoanTerm()))
            && (this.getLoanStartDate() == null ? other.getLoanStartDate() == null : this.getLoanStartDate().equals(other.getLoanStartDate()))
            && (this.getLoanEndDate() == null ? other.getLoanEndDate() == null : this.getLoanEndDate().equals(other.getLoanEndDate()))
            && (this.getCollateralType() == null ? other.getCollateralType() == null : this.getCollateralType().equals(other.getCollateralType()))
            && (this.getLoanStatus() == null ? other.getLoanStatus() == null : this.getLoanStatus().equals(other.getLoanStatus()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAgricultureLoanId() == null) ? 0 : getAgricultureLoanId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getLoanTerm() == null) ? 0 : getLoanTerm().hashCode());
        result = prime * result + ((getLoanStartDate() == null) ? 0 : getLoanStartDate().hashCode());
        result = prime * result + ((getLoanEndDate() == null) ? 0 : getLoanEndDate().hashCode());
        result = prime * result + ((getCollateralType() == null) ? 0 : getCollateralType().hashCode());
        result = prime * result + ((getLoanStatus() == null) ? 0 : getLoanStatus().hashCode());
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
        sb.append(", agricultureLoanId=").append(agricultureLoanId);
        sb.append(", customerId=").append(customerId);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", loanTerm=").append(loanTerm);
        sb.append(", loanStartDate=").append(loanStartDate);
        sb.append(", loanEndDate=").append(loanEndDate);
        sb.append(", collateralType=").append(collateralType);
        sb.append(", loanStatus=").append(loanStatus);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}