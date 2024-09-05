package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务规则主列表
 * @TableName task_rule
 */
@TableName(value ="task_rule")
@Data
public class TaskRule implements Serializable {
    /**
     * 序号
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 规则编号
     */
    private String ruleNamber;

    /**
     * 网点名称
     */
    private String netPointNamber;

    /**
     * 产品编号
     */
    private String productNumber;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 借据金额上限
     */
    private String loanCeiling;

    /**
     * 借据金额下限
     */
    private String loanFloor;

    /**
     * 生效日期
     */
    private Date startDate;

    /**
     * 失效日期
     */
    private Date endDate;

    /**
     * 规则状态
     */
    private String ruleStatus;

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
        TaskRule other = (TaskRule) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleNamber() == null ? other.getRuleNamber() == null : this.getRuleNamber().equals(other.getRuleNamber()))
            && (this.getNetPointNamber() == null ? other.getNetPointNamber() == null : this.getNetPointNamber().equals(other.getNetPointNamber()))
            && (this.getProductNumber() == null ? other.getProductNumber() == null : this.getProductNumber().equals(other.getProductNumber()))
            && (this.getProductName() == null ? other.getProductName() == null : this.getProductName().equals(other.getProductName()))
            && (this.getLoanCeiling() == null ? other.getLoanCeiling() == null : this.getLoanCeiling().equals(other.getLoanCeiling()))
            && (this.getLoanFloor() == null ? other.getLoanFloor() == null : this.getLoanFloor().equals(other.getLoanFloor()))
            && (this.getStartDate() == null ? other.getStartDate() == null : this.getStartDate().equals(other.getStartDate()))
            && (this.getEndDate() == null ? other.getEndDate() == null : this.getEndDate().equals(other.getEndDate()))
            && (this.getRuleStatus() == null ? other.getRuleStatus() == null : this.getRuleStatus().equals(other.getRuleStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRuleNamber() == null) ? 0 : getRuleNamber().hashCode());
        result = prime * result + ((getNetPointNamber() == null) ? 0 : getNetPointNamber().hashCode());
        result = prime * result + ((getProductNumber() == null) ? 0 : getProductNumber().hashCode());
        result = prime * result + ((getProductName() == null) ? 0 : getProductName().hashCode());
        result = prime * result + ((getLoanCeiling() == null) ? 0 : getLoanCeiling().hashCode());
        result = prime * result + ((getLoanFloor() == null) ? 0 : getLoanFloor().hashCode());
        result = prime * result + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        result = prime * result + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        result = prime * result + ((getRuleStatus() == null) ? 0 : getRuleStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ruleNamber=").append(ruleNamber);
        sb.append(", netPointNamber=").append(netPointNamber);
        sb.append(", productNumber=").append(productNumber);
        sb.append(", productName=").append(productName);
        sb.append(", loanCeiling=").append(loanCeiling);
        sb.append(", loanFloor=").append(loanFloor);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", ruleStatus=").append(ruleStatus);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}