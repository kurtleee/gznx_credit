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
 * @TableName repayment_plan
 */
@TableName(value ="repayment_plan")
public class RepaymentPlan implements Serializable {
    /**
     * 还款计划ID
     */
    @TableId(type = IdType.AUTO)
    private Long planId;

    /**
     * 贷款ID
     */
    private Long loanId;

    /**
     * 还款日期
     */
    private Date repaymentDate;

    /**
     * 还款金额
     */
    private BigDecimal repaymentAmount;

    /**
     * 还款状态
     */
    private String repaymentStatus;

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
     * 还款计划ID
     */
    public Long getPlanId() {
        return planId;
    }

    /**
     * 还款计划ID
     */
    public void setPlanId(Long planId) {
        this.planId = planId;
    }

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
     * 还款日期
     */
    public Date getRepaymentDate() {
        return repaymentDate;
    }

    /**
     * 还款日期
     */
    public void setRepaymentDate(Date repaymentDate) {
        this.repaymentDate = repaymentDate;
    }

    /**
     * 还款金额
     */
    public BigDecimal getRepaymentAmount() {
        return repaymentAmount;
    }

    /**
     * 还款金额
     */
    public void setRepaymentAmount(BigDecimal repaymentAmount) {
        this.repaymentAmount = repaymentAmount;
    }

    /**
     * 还款状态
     */
    public String getRepaymentStatus() {
        return repaymentStatus;
    }

    /**
     * 还款状态
     */
    public void setRepaymentStatus(String repaymentStatus) {
        this.repaymentStatus = repaymentStatus;
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
        RepaymentPlan other = (RepaymentPlan) that;
        return (this.getPlanId() == null ? other.getPlanId() == null : this.getPlanId().equals(other.getPlanId()))
            && (this.getLoanId() == null ? other.getLoanId() == null : this.getLoanId().equals(other.getLoanId()))
            && (this.getRepaymentDate() == null ? other.getRepaymentDate() == null : this.getRepaymentDate().equals(other.getRepaymentDate()))
            && (this.getRepaymentAmount() == null ? other.getRepaymentAmount() == null : this.getRepaymentAmount().equals(other.getRepaymentAmount()))
            && (this.getRepaymentStatus() == null ? other.getRepaymentStatus() == null : this.getRepaymentStatus().equals(other.getRepaymentStatus()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getPlanId() == null) ? 0 : getPlanId().hashCode());
        result = prime * result + ((getLoanId() == null) ? 0 : getLoanId().hashCode());
        result = prime * result + ((getRepaymentDate() == null) ? 0 : getRepaymentDate().hashCode());
        result = prime * result + ((getRepaymentAmount() == null) ? 0 : getRepaymentAmount().hashCode());
        result = prime * result + ((getRepaymentStatus() == null) ? 0 : getRepaymentStatus().hashCode());
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
        sb.append(", planId=").append(planId);
        sb.append(", loanId=").append(loanId);
        sb.append(", repaymentDate=").append(repaymentDate);
        sb.append(", repaymentAmount=").append(repaymentAmount);
        sb.append(", repaymentStatus=").append(repaymentStatus);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}