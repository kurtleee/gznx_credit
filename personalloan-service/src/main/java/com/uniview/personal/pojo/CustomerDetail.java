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
 * 客户详情表
 * @TableName customer_detail
 */
@TableName(value ="customer_detail")
@Data
public class CustomerDetail implements Serializable {
    /**
     * 客户详情ID
     */
    @TableId(type = IdType.AUTO)
    private Integer customerDetailId;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户类型（1: 农户, 2: 个人）
     */
    private Integer customerType;

    /**
     * 性别（1：男，2：女）
     */
    private Integer sex;

    /**
     * 用于识别用户（发卡银行标识码+客户号+检验码）
发卡银行标识码：识别发卡银行
客户号：你懂的
检验码：验证客户号的正确性（1：正确；0：错误）
     */
    private Integer ecifNumber;

    /**
     * 证件类型
     */
    private Integer idType;

    /**
     * 证件号码
     */
    private String idNumber;

    /**
     * 核查属实
     */
    private Integer checkTrue;

    /**
     * 证件起始日
     */
    private Date idStart;

    /**
     * 证件到期日
     */
    private Date idEnd;

    /**
     * 证件发证机构
     */
    private String idInstitution;

    /**
     * 行业类型
     */
    private String industryType;

    /**
     * 客户和我行的关系（1：存款；2：贷款  3：投资）
     */
    private Integer bankRelationship;

    /**
     * 拥有我行持投比例
     */
    private BigDecimal holdingRatio;

    /**
     * 在我行职务
     */
    private Integer bankPosition;

    /**
     * 家庭成员数
     */
    private Integer householdSize;

    /**
     * 是否是股东
     */
    private Integer shareholderWhether;

    /**
     * 入股时间
     */
    private Date shareholderTime;

    /**
     * 入股机构
     */
    private String shareholderInstitution;

    /**
     * 入股金额
     */
    private BigDecimal shareholderAmount;

    /**
     * 民族
     */
    private String ethnic;

    /**
     * 户籍地
     */
    private String domicile;

    /**
     * 户籍地详细地址
     */
    private String domicileDetail;

    /**
     * 出生日期
     */
    private Date bornDate;

    /**
     * 政治面貌（1：中共党员  2：共青团员   3：群众）
     */
    private Integer politicalOutlook;

    /**
     * 最高学位（1.学士   2.硕士   3.博士）
     */
    private String highestDegree;

    /**
     * 是否缴纳五险一金（1.是  2.否）
     */
    private Integer fiveWhether;

    /**
     * 社会保障情况
     */
    private Integer socialSecuritySituation;

    /**
     * 居住情况
     */
    private Integer livingSituation;

    /**
     * 居住地址
     */
    private String livingAddress;

    /**
     * 居住地址详情
     */
    private String livingAddressDetail;

    /**
     * 最高学历（1.专科   2.本科   3.硕士）
     */
    private Integer highestEducation;

    /**
     * 联系电话
     */
    private String phoneNumber;

    /**
     * 地址
     */
    private String address;

    /**
     * 信用等级
     */
    private Integer creditRating;

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
        CustomerDetail other = (CustomerDetail) that;
        return (this.getCustomerDetailId() == null ? other.getCustomerDetailId() == null : this.getCustomerDetailId().equals(other.getCustomerDetailId()))
            && (this.getCustomerId() == null ? other.getCustomerId() == null : this.getCustomerId().equals(other.getCustomerId()))
            && (this.getCustomerName() == null ? other.getCustomerName() == null : this.getCustomerName().equals(other.getCustomerName()))
            && (this.getCustomerType() == null ? other.getCustomerType() == null : this.getCustomerType().equals(other.getCustomerType()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEcifNumber() == null ? other.getEcifNumber() == null : this.getEcifNumber().equals(other.getEcifNumber()))
            && (this.getIdType() == null ? other.getIdType() == null : this.getIdType().equals(other.getIdType()))
            && (this.getIdNumber() == null ? other.getIdNumber() == null : this.getIdNumber().equals(other.getIdNumber()))
            && (this.getCheckTrue() == null ? other.getCheckTrue() == null : this.getCheckTrue().equals(other.getCheckTrue()))
            && (this.getIdStart() == null ? other.getIdStart() == null : this.getIdStart().equals(other.getIdStart()))
            && (this.getIdEnd() == null ? other.getIdEnd() == null : this.getIdEnd().equals(other.getIdEnd()))
            && (this.getIdInstitution() == null ? other.getIdInstitution() == null : this.getIdInstitution().equals(other.getIdInstitution()))
            && (this.getIndustryType() == null ? other.getIndustryType() == null : this.getIndustryType().equals(other.getIndustryType()))
            && (this.getBankRelationship() == null ? other.getBankRelationship() == null : this.getBankRelationship().equals(other.getBankRelationship()))
            && (this.getHoldingRatio() == null ? other.getHoldingRatio() == null : this.getHoldingRatio().equals(other.getHoldingRatio()))
            && (this.getBankPosition() == null ? other.getBankPosition() == null : this.getBankPosition().equals(other.getBankPosition()))
            && (this.getHouseholdSize() == null ? other.getHouseholdSize() == null : this.getHouseholdSize().equals(other.getHouseholdSize()))
            && (this.getShareholderWhether() == null ? other.getShareholderWhether() == null : this.getShareholderWhether().equals(other.getShareholderWhether()))
            && (this.getShareholderTime() == null ? other.getShareholderTime() == null : this.getShareholderTime().equals(other.getShareholderTime()))
            && (this.getShareholderInstitution() == null ? other.getShareholderInstitution() == null : this.getShareholderInstitution().equals(other.getShareholderInstitution()))
            && (this.getShareholderAmount() == null ? other.getShareholderAmount() == null : this.getShareholderAmount().equals(other.getShareholderAmount()))
            && (this.getEthnic() == null ? other.getEthnic() == null : this.getEthnic().equals(other.getEthnic()))
            && (this.getDomicile() == null ? other.getDomicile() == null : this.getDomicile().equals(other.getDomicile()))
            && (this.getDomicileDetail() == null ? other.getDomicileDetail() == null : this.getDomicileDetail().equals(other.getDomicileDetail()))
            && (this.getBornDate() == null ? other.getBornDate() == null : this.getBornDate().equals(other.getBornDate()))
            && (this.getPoliticalOutlook() == null ? other.getPoliticalOutlook() == null : this.getPoliticalOutlook().equals(other.getPoliticalOutlook()))
            && (this.getHighestDegree() == null ? other.getHighestDegree() == null : this.getHighestDegree().equals(other.getHighestDegree()))
            && (this.getFiveWhether() == null ? other.getFiveWhether() == null : this.getFiveWhether().equals(other.getFiveWhether()))
            && (this.getSocialSecuritySituation() == null ? other.getSocialSecuritySituation() == null : this.getSocialSecuritySituation().equals(other.getSocialSecuritySituation()))
            && (this.getLivingSituation() == null ? other.getLivingSituation() == null : this.getLivingSituation().equals(other.getLivingSituation()))
            && (this.getLivingAddress() == null ? other.getLivingAddress() == null : this.getLivingAddress().equals(other.getLivingAddress()))
            && (this.getLivingAddressDetail() == null ? other.getLivingAddressDetail() == null : this.getLivingAddressDetail().equals(other.getLivingAddressDetail()))
            && (this.getHighestEducation() == null ? other.getHighestEducation() == null : this.getHighestEducation().equals(other.getHighestEducation()))
            && (this.getPhoneNumber() == null ? other.getPhoneNumber() == null : this.getPhoneNumber().equals(other.getPhoneNumber()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getCreditRating() == null ? other.getCreditRating() == null : this.getCreditRating().equals(other.getCreditRating()))
            && (this.getCreatedAt() == null ? other.getCreatedAt() == null : this.getCreatedAt().equals(other.getCreatedAt()))
            && (this.getUpdatedAt() == null ? other.getUpdatedAt() == null : this.getUpdatedAt().equals(other.getUpdatedAt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomerDetailId() == null) ? 0 : getCustomerDetailId().hashCode());
        result = prime * result + ((getCustomerId() == null) ? 0 : getCustomerId().hashCode());
        result = prime * result + ((getCustomerName() == null) ? 0 : getCustomerName().hashCode());
        result = prime * result + ((getCustomerType() == null) ? 0 : getCustomerType().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEcifNumber() == null) ? 0 : getEcifNumber().hashCode());
        result = prime * result + ((getIdType() == null) ? 0 : getIdType().hashCode());
        result = prime * result + ((getIdNumber() == null) ? 0 : getIdNumber().hashCode());
        result = prime * result + ((getCheckTrue() == null) ? 0 : getCheckTrue().hashCode());
        result = prime * result + ((getIdStart() == null) ? 0 : getIdStart().hashCode());
        result = prime * result + ((getIdEnd() == null) ? 0 : getIdEnd().hashCode());
        result = prime * result + ((getIdInstitution() == null) ? 0 : getIdInstitution().hashCode());
        result = prime * result + ((getIndustryType() == null) ? 0 : getIndustryType().hashCode());
        result = prime * result + ((getBankRelationship() == null) ? 0 : getBankRelationship().hashCode());
        result = prime * result + ((getHoldingRatio() == null) ? 0 : getHoldingRatio().hashCode());
        result = prime * result + ((getBankPosition() == null) ? 0 : getBankPosition().hashCode());
        result = prime * result + ((getHouseholdSize() == null) ? 0 : getHouseholdSize().hashCode());
        result = prime * result + ((getShareholderWhether() == null) ? 0 : getShareholderWhether().hashCode());
        result = prime * result + ((getShareholderTime() == null) ? 0 : getShareholderTime().hashCode());
        result = prime * result + ((getShareholderInstitution() == null) ? 0 : getShareholderInstitution().hashCode());
        result = prime * result + ((getShareholderAmount() == null) ? 0 : getShareholderAmount().hashCode());
        result = prime * result + ((getEthnic() == null) ? 0 : getEthnic().hashCode());
        result = prime * result + ((getDomicile() == null) ? 0 : getDomicile().hashCode());
        result = prime * result + ((getDomicileDetail() == null) ? 0 : getDomicileDetail().hashCode());
        result = prime * result + ((getBornDate() == null) ? 0 : getBornDate().hashCode());
        result = prime * result + ((getPoliticalOutlook() == null) ? 0 : getPoliticalOutlook().hashCode());
        result = prime * result + ((getHighestDegree() == null) ? 0 : getHighestDegree().hashCode());
        result = prime * result + ((getFiveWhether() == null) ? 0 : getFiveWhether().hashCode());
        result = prime * result + ((getSocialSecuritySituation() == null) ? 0 : getSocialSecuritySituation().hashCode());
        result = prime * result + ((getLivingSituation() == null) ? 0 : getLivingSituation().hashCode());
        result = prime * result + ((getLivingAddress() == null) ? 0 : getLivingAddress().hashCode());
        result = prime * result + ((getLivingAddressDetail() == null) ? 0 : getLivingAddressDetail().hashCode());
        result = prime * result + ((getHighestEducation() == null) ? 0 : getHighestEducation().hashCode());
        result = prime * result + ((getPhoneNumber() == null) ? 0 : getPhoneNumber().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getCreditRating() == null) ? 0 : getCreditRating().hashCode());
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
        sb.append(", customerDetailId=").append(customerDetailId);
        sb.append(", customerId=").append(customerId);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerType=").append(customerType);
        sb.append(", sex=").append(sex);
        sb.append(", ecifNumber=").append(ecifNumber);
        sb.append(", idType=").append(idType);
        sb.append(", idNumber=").append(idNumber);
        sb.append(", checkTrue=").append(checkTrue);
        sb.append(", idStart=").append(idStart);
        sb.append(", idEnd=").append(idEnd);
        sb.append(", idInstitution=").append(idInstitution);
        sb.append(", industryType=").append(industryType);
        sb.append(", bankRelationship=").append(bankRelationship);
        sb.append(", holdingRatio=").append(holdingRatio);
        sb.append(", bankPosition=").append(bankPosition);
        sb.append(", householdSize=").append(householdSize);
        sb.append(", shareholderWhether=").append(shareholderWhether);
        sb.append(", shareholderTime=").append(shareholderTime);
        sb.append(", shareholderInstitution=").append(shareholderInstitution);
        sb.append(", shareholderAmount=").append(shareholderAmount);
        sb.append(", ethnic=").append(ethnic);
        sb.append(", domicile=").append(domicile);
        sb.append(", domicileDetail=").append(domicileDetail);
        sb.append(", bornDate=").append(bornDate);
        sb.append(", politicalOutlook=").append(politicalOutlook);
        sb.append(", highestDegree=").append(highestDegree);
        sb.append(", fiveWhether=").append(fiveWhether);
        sb.append(", socialSecuritySituation=").append(socialSecuritySituation);
        sb.append(", livingSituation=").append(livingSituation);
        sb.append(", livingAddress=").append(livingAddress);
        sb.append(", livingAddressDetail=").append(livingAddressDetail);
        sb.append(", highestEducation=").append(highestEducation);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", address=").append(address);
        sb.append(", creditRating=").append(creditRating);
        sb.append(", createdAt=").append(createdAt);
        sb.append(", updatedAt=").append(updatedAt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}