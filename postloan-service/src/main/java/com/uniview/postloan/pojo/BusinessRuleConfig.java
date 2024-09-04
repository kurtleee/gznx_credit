package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 业务规则配置表
 * @TableName business_rule_config
 */
@TableName(value ="business_rule_config")
@Data
public class BusinessRuleConfig implements Serializable {
    /**
     * 业务规则ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 规则描述
     */
    private String ruleDescription;

    /**
     * 网点名称
     */
    private Integer netPointName;

    /**
     * 客户类型
     */
    private Integer customerType;

    /**
     * 提前天数
     */
    private Integer daysBeforeDue;

    /**
     * 催收类型（1：轻度逾期，2：中度逾期、3:重度逾期）
     */
    private Integer taskType;

    /**
     * 催收方式：1:短信/电子邮件、2：电话、3：上门访问、4：诉讼
     */
    private Integer taskMethods;

    /**
     * 还款方式（1：等额本息，2：等额本金，3：等本等息，4：先息后本，5：一次性还本付息，随借随还）
     */
    private Integer repaymentMethod;

    /**
     * 是否轮询（1：是，2：否）
     */
    private Integer polling;

    /**
     * 轮询类型（1：账户余额轮询，2：交易监控轮询，3：风险评估轮询，4：合规性检查轮询）
     */
    private Integer pollingType;

    /**
     * 轮询天数
     */
    private Integer pollingDay;

    /**
     * 规则状态（1：待生效，2：已生效）
     */
    private Integer ruleStatus;

    /**
     * 更新人
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 更新网点
     */
    private Date updateNetPoint;

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
        BusinessRuleConfig other = (BusinessRuleConfig) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleDescription() == null ? other.getRuleDescription() == null : this.getRuleDescription().equals(other.getRuleDescription()))
            && (this.getNetPointName() == null ? other.getNetPointName() == null : this.getNetPointName().equals(other.getNetPointName()))
            && (this.getCustomerType() == null ? other.getCustomerType() == null : this.getCustomerType().equals(other.getCustomerType()))
            && (this.getDaysBeforeDue() == null ? other.getDaysBeforeDue() == null : this.getDaysBeforeDue().equals(other.getDaysBeforeDue()))
            && (this.getTaskType() == null ? other.getTaskType() == null : this.getTaskType().equals(other.getTaskType()))
            && (this.getTaskMethods() == null ? other.getTaskMethods() == null : this.getTaskMethods().equals(other.getTaskMethods()))
            && (this.getRepaymentMethod() == null ? other.getRepaymentMethod() == null : this.getRepaymentMethod().equals(other.getRepaymentMethod()))
            && (this.getPolling() == null ? other.getPolling() == null : this.getPolling().equals(other.getPolling()))
            && (this.getPollingType() == null ? other.getPollingType() == null : this.getPollingType().equals(other.getPollingType()))
            && (this.getPollingDay() == null ? other.getPollingDay() == null : this.getPollingDay().equals(other.getPollingDay()))
            && (this.getRuleStatus() == null ? other.getRuleStatus() == null : this.getRuleStatus().equals(other.getRuleStatus()))
            && (this.getUpdateBy() == null ? other.getUpdateBy() == null : this.getUpdateBy().equals(other.getUpdateBy()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()))
            && (this.getUpdateNetPoint() == null ? other.getUpdateNetPoint() == null : this.getUpdateNetPoint().equals(other.getUpdateNetPoint()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRuleDescription() == null) ? 0 : getRuleDescription().hashCode());
        result = prime * result + ((getNetPointName() == null) ? 0 : getNetPointName().hashCode());
        result = prime * result + ((getCustomerType() == null) ? 0 : getCustomerType().hashCode());
        result = prime * result + ((getDaysBeforeDue() == null) ? 0 : getDaysBeforeDue().hashCode());
        result = prime * result + ((getTaskType() == null) ? 0 : getTaskType().hashCode());
        result = prime * result + ((getTaskMethods() == null) ? 0 : getTaskMethods().hashCode());
        result = prime * result + ((getRepaymentMethod() == null) ? 0 : getRepaymentMethod().hashCode());
        result = prime * result + ((getPolling() == null) ? 0 : getPolling().hashCode());
        result = prime * result + ((getPollingType() == null) ? 0 : getPollingType().hashCode());
        result = prime * result + ((getPollingDay() == null) ? 0 : getPollingDay().hashCode());
        result = prime * result + ((getRuleStatus() == null) ? 0 : getRuleStatus().hashCode());
        result = prime * result + ((getUpdateBy() == null) ? 0 : getUpdateBy().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        result = prime * result + ((getUpdateNetPoint() == null) ? 0 : getUpdateNetPoint().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ruleDescription=").append(ruleDescription);
        sb.append(", netPointName=").append(netPointName);
        sb.append(", customerType=").append(customerType);
        sb.append(", daysBeforeDue=").append(daysBeforeDue);
        sb.append(", taskType=").append(taskType);
        sb.append(", taskMethods=").append(taskMethods);
        sb.append(", repaymentMethod=").append(repaymentMethod);
        sb.append(", polling=").append(polling);
        sb.append(", pollingType=").append(pollingType);
        sb.append(", pollingDay=").append(pollingDay);
        sb.append(", ruleStatus=").append(ruleStatus);
        sb.append(", updateBy=").append(updateBy);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateNetPoint=").append(updateNetPoint);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}