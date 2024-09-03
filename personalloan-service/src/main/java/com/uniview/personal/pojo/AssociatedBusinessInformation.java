package com.uniview.personal.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * 个贷关联业务信息
 * @TableName associated_business_information
 */
@TableName(value ="associated_business_information")
@Data
public class AssociatedBusinessInformation implements Serializable {
    /**
     * 关联业务信息ID
     */
    @TableId
    private Long associatedBusinessId;

    /**
     * 合同编号
     */
    private Integer contractNumber;

    /**
     * 借据号
     */
    private String ioNumber;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 客户号
     */
    private Long clientNumber;

    /**
     * 贷款方式
     */
    private String loanOption;

    /**
     * 主担保方式
     */
    private String mainGuaranteeOption;

    /**
     * 贷款金额
     */
    private BigDecimal loanAmount;

    /**
     * 贷款余额
     */
    private BigDecimal loanBalance;

    /**
     * 重组金额
     */
    private BigDecimal restructuringAmount;

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
        AssociatedBusinessInformation other = (AssociatedBusinessInformation) that;
        return (this.getAssociatedBusinessId() == null ? other.getAssociatedBusinessId() == null : this.getAssociatedBusinessId().equals(other.getAssociatedBusinessId()))
            && (this.getContractNumber() == null ? other.getContractNumber() == null : this.getContractNumber().equals(other.getContractNumber()))
            && (this.getIoNumber() == null ? other.getIoNumber() == null : this.getIoNumber().equals(other.getIoNumber()))
            && (this.getClientName() == null ? other.getClientName() == null : this.getClientName().equals(other.getClientName()))
            && (this.getClientNumber() == null ? other.getClientNumber() == null : this.getClientNumber().equals(other.getClientNumber()))
            && (this.getLoanOption() == null ? other.getLoanOption() == null : this.getLoanOption().equals(other.getLoanOption()))
            && (this.getMainGuaranteeOption() == null ? other.getMainGuaranteeOption() == null : this.getMainGuaranteeOption().equals(other.getMainGuaranteeOption()))
            && (this.getLoanAmount() == null ? other.getLoanAmount() == null : this.getLoanAmount().equals(other.getLoanAmount()))
            && (this.getLoanBalance() == null ? other.getLoanBalance() == null : this.getLoanBalance().equals(other.getLoanBalance()))
            && (this.getRestructuringAmount() == null ? other.getRestructuringAmount() == null : this.getRestructuringAmount().equals(other.getRestructuringAmount()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAssociatedBusinessId() == null) ? 0 : getAssociatedBusinessId().hashCode());
        result = prime * result + ((getContractNumber() == null) ? 0 : getContractNumber().hashCode());
        result = prime * result + ((getIoNumber() == null) ? 0 : getIoNumber().hashCode());
        result = prime * result + ((getClientName() == null) ? 0 : getClientName().hashCode());
        result = prime * result + ((getClientNumber() == null) ? 0 : getClientNumber().hashCode());
        result = prime * result + ((getLoanOption() == null) ? 0 : getLoanOption().hashCode());
        result = prime * result + ((getMainGuaranteeOption() == null) ? 0 : getMainGuaranteeOption().hashCode());
        result = prime * result + ((getLoanAmount() == null) ? 0 : getLoanAmount().hashCode());
        result = prime * result + ((getLoanBalance() == null) ? 0 : getLoanBalance().hashCode());
        result = prime * result + ((getRestructuringAmount() == null) ? 0 : getRestructuringAmount().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", associatedBusinessId=").append(associatedBusinessId);
        sb.append(", contractNumber=").append(contractNumber);
        sb.append(", ioNumber=").append(ioNumber);
        sb.append(", clientName=").append(clientName);
        sb.append(", clientNumber=").append(clientNumber);
        sb.append(", loanOption=").append(loanOption);
        sb.append(", mainGuaranteeOption=").append(mainGuaranteeOption);
        sb.append(", loanAmount=").append(loanAmount);
        sb.append(", loanBalance=").append(loanBalance);
        sb.append(", restructuringAmount=").append(restructuringAmount);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}