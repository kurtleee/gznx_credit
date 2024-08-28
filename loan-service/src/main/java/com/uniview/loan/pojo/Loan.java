package com.uniview.loan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 
 * @TableName loan
 */
@TableName(value ="loan")
public class Loan implements Serializable {
    /**
     * 贷款ID
     */
    @TableId(type = IdType.AUTO)
    private Long loanId;

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
     * 贷款利率
     */
    private BigDecimal loanInterestRate;

    /**
     * 贷款开始日期
     */
    private Date loanStartDate;

    /**
     * 贷款结束日期
     */
    private Date loanEndDate;

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
     * 贷款ID
     */
    public Long getLoanId() {
        return loanId;
    }

    /**
     * 贷款ID
     */
    public void setLoanId(Long loanId) {
        this.loanId = loanId;
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
     * 贷款利率
     */
    public BigDecimal getLoanInterestRate() {
        return loanInterestRate;
    }

    /**
     * 贷款利率
     */
    public void setLoanInterestRate(BigDecimal loanInterestRate) {
        this.loanInterestRate = loanInterestRate;
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
        Loan other = (Loan) that;
        return (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getLoanTerm() == null ? other.getLoanTerm() == null : this.getLoanTerm().equals(other.getLoanTerm()))
            && (this.getLoanInterestRate() == null ? other.getLoanInterestRate() == null : this.getLoanInterestRate().equals(other.getLoanInterestRate()))
            && (this.getLoanStartDate() == null ? other.getLoanStartDate() == null : this.getLoanStartDate().equals(other.getLoanStartDate()))
            && (this.getLoanEndDate() == null ? other.getLoanEndDate() == null : this.getLoanEndDate().equals(other.getLoanEndDate()))
            && (this.getLoanStatus() == null ? other.getLoanStatus() == null : this.getLoanStatus().equals(other.getLoanStatus()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getLoanTerm() == null) ? 0 : getLoanTerm().hashCode());
        result = prime * result + ((getLoanInterestRate() == null) ? 0 : getLoanInterestRate().hashCode());
        result = prime * result + ((getLoanStartDate() == null) ? 0 : getLoanStartDate().hashCode());
        result = prime * result + ((getLoanEndDate() == null) ? 0 : getLoanEndDate().hashCode());
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
        sb.append(", loanId=").append(loanId);
        sb.append(", customerId=").append(customerId);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", loanTerm=").append(loanTerm);
        sb.append(", loanInterestRate=").append(loanInterestRate);
        sb.append(", loanStartDate=").append(loanStartDate);
        sb.append(", loanEndDate=").append(loanEndDate);
        sb.append(", loanStatus=").append(loanStatus);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}