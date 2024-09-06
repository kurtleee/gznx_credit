package com.uniview.personal.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName contracts
 */
@TableName(value ="contracts")
@Data
public class Contracts implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer contractId;

    /**
     * 
     */
    private String customerName;

    /**
     * 
     */
    private String customerNumber;

    /**
     * 
     */
    private String mainGuaranteeMethod;

    /**
     * 
     */
    private String contractStatus;

    /**
     * 
     */
    private Date createdAt;

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
        Contracts other = (Contracts) that;
        return (this.getContractId() == null ? other.getContractId() == null : this.getContractId().equals(other.getContractId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerNumber() == null ? other.getCustomerNumber() == null : this.getCustomerNumber().equals(other.getCustomerNumber()))
            && (this.getMainGuaranteeMethod() == null ? other.getMainGuaranteeMethod() == null : this.getMainGuaranteeMethod().equals(other.getMainGuaranteeMethod()))
            && (this.getContractStatus() == null ? other.getContractStatus() == null : this.getContractStatus().equals(other.getContractStatus()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getContractId() == null) ? 0 : getContractId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerNumber() == null) ? 0 : getCustomerNumber().hashCode());
        result = prime * result + ((getMainGuaranteeMethod() == null) ? 0 : getMainGuaranteeMethod().hashCode());
        result = prime * result + ((getContractStatus() == null) ? 0 : getContractStatus().hashCode());
        result = prime * result + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contractId=").append(contractId);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerNumber=").append(customerNumber);
        sb.append(", mainGuaranteeMethod=").append(mainGuaranteeMethod);
        sb.append(", contractStatus=").append(contractStatus);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}