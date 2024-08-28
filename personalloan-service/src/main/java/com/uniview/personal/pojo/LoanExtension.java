package com.uniview.personal.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName loan_extension
 */
@TableName(value ="loan_extension")
@Data
public class LoanExtension implements Serializable {
    /**
     * 业务流水号，作为表的主键
     */
    @TableId
    private String businessSerialNumber;

    /**
     * 客户编号
     */
    private String customerNumber;

    /**
     * 产品ID
     */
    private Integer productId;

    /**
     * 展期金额，最多15位数字，小数点后2位
     */
    private BigDecimal extendedAmount;

    /**
     * 客户经理
     */
    private Integer customerManager;

    /**
     * 管户网点
     */
    private Integer managedBranch;

    /**
     * 审批状态
     */
    private Integer approvalStatus;

    /**
     * 登记日期
     */
    private Date registrationDate;

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
        LoanExtension other = (LoanExtension) that;
        return (this.getBusinessSerialNumber() == null ? other.getBusinessSerialNumber() == null : this.getBusinessSerialNumber().equals(other.getBusinessSerialNumber()))
            && (this.getCustomerNumber() == null ? other.getCustomerNumber() == null : this.getCustomerNumber().equals(other.getCustomerNumber()))
            && (this.getProductId() == null ? other.getProductId() == null : this.getProductId().equals(other.getProductId()))
            && (this.getExtendedAmount() == null ? other.getExtendedAmount() == null : this.getExtendedAmount().equals(other.getExtendedAmount()))
            && (this.getCustomerManager() == null ? other.getCustomerManager() == null : this.getCustomerManager().equals(other.getCustomerManager()))
            && (this.getManagedBranch() == null ? other.getManagedBranch() == null : this.getManagedBranch().equals(other.getManagedBranch()))
            && (this.getApprovalStatus() == null ? other.getApprovalStatus() == null : this.getApprovalStatus().equals(other.getApprovalStatus()))
            && (this.getRegistrationDate() == null ? other.getRegistrationDate() == null : this.getRegistrationDate().equals(other.getRegistrationDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getBusinessSerialNumber() == null) ? 0 : getBusinessSerialNumber().hashCode());
        result = prime * result + ((getCustomerNumber() == null) ? 0 : getCustomerNumber().hashCode());
        result = prime * result + ((getProductId() == null) ? 0 : getProductId().hashCode());
        result = prime * result + ((getExtendedAmount() == null) ? 0 : getExtendedAmount().hashCode());
        result = prime * result + ((getCustomerManager() == null) ? 0 : getCustomerManager().hashCode());
        result = prime * result + ((getManagedBranch() == null) ? 0 : getManagedBranch().hashCode());
        result = prime * result + ((getApprovalStatus() == null) ? 0 : getApprovalStatus().hashCode());
        result = prime * result + ((getRegistrationDate() == null) ? 0 : getRegistrationDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", businessSerialNumber=").append(businessSerialNumber);
        sb.append(", customerNumber=").append(customerNumber);
        sb.append(", productId=").append(productId);
        sb.append(", extendedAmount=").append(extendedAmount);
        sb.append(", customerManager=").append(customerManager);
        sb.append(", managedBranch=").append(managedBranch);
        sb.append(", approvalStatus=").append(approvalStatus);
        sb.append(", registrationDate=").append(registrationDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}