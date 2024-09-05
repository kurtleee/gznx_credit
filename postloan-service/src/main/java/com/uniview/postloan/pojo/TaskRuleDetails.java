package com.uniview.postloan.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 任务规则详情
 * @TableName task_rule_details
 */
@TableName(value ="task_rule_details")
@Data
public class TaskRuleDetails implements Serializable {
    /**
     * 
     */
    @TableId
    private Integer id;

    /**
     * 规则编号
     */
    private String ruleNumber;

    /**
     * 规则说明
     */
    private String ruleDescription;

    /**
     * 网点
     */
    private String netPoint;

    /**
     * 借据金额上限
     */
    private String loanCeiling;

    /**
     * 借据金额下限
     */
    private String loanFloor;

    /**
     * 回访类型
     */
    private String followupType;

    /**
     * 回访人员类型
     */
    private String followupPersonType;

    /**
     * 回访完成日期
     */
    private Date followupFinishDate;

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
        TaskRuleDetails other = (TaskRuleDetails) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getRuleNumber() == null ? other.getRuleNumber() == null : this.getRuleNumber().equals(other.getRuleNumber()))
            && (this.getRuleDescription() == null ? other.getRuleDescription() == null : this.getRuleDescription().equals(other.getRuleDescription()))
            && (this.getNetPoint() == null ? other.getNetPoint() == null : this.getNetPoint().equals(other.getNetPoint()))
            && (this.getLoanCeiling() == null ? other.getLoanCeiling() == null : this.getLoanCeiling().equals(other.getLoanCeiling()))
            && (this.getLoanFloor() == null ? other.getLoanFloor() == null : this.getLoanFloor().equals(other.getLoanFloor()))
            && (this.getFollowupType() == null ? other.getFollowupType() == null : this.getFollowupType().equals(other.getFollowupType()))
            && (this.getFollowupPersonType() == null ? other.getFollowupPersonType() == null : this.getFollowupPersonType().equals(other.getFollowupPersonType()))
            && (this.getFollowupFinishDate() == null ? other.getFollowupFinishDate() == null : this.getFollowupFinishDate().equals(other.getFollowupFinishDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getRuleNumber() == null) ? 0 : getRuleNumber().hashCode());
        result = prime * result + ((getRuleDescription() == null) ? 0 : getRuleDescription().hashCode());
        result = prime * result + ((getNetPoint() == null) ? 0 : getNetPoint().hashCode());
        result = prime * result + ((getLoanCeiling() == null) ? 0 : getLoanCeiling().hashCode());
        result = prime * result + ((getLoanFloor() == null) ? 0 : getLoanFloor().hashCode());
        result = prime * result + ((getFollowupType() == null) ? 0 : getFollowupType().hashCode());
        result = prime * result + ((getFollowupPersonType() == null) ? 0 : getFollowupPersonType().hashCode());
        result = prime * result + ((getFollowupFinishDate() == null) ? 0 : getFollowupFinishDate().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ruleNumber=").append(ruleNumber);
        sb.append(", ruleDescription=").append(ruleDescription);
        sb.append(", netPoint=").append(netPoint);
        sb.append(", loanCeiling=").append(loanCeiling);
        sb.append(", loanFloor=").append(loanFloor);
        sb.append(", followupType=").append(followupType);
        sb.append(", followupPersonType=").append(followupPersonType);
        sb.append(", followupFinishDate=").append(followupFinishDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}