package com.uniview.workflow.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 业务申请表
 * @TableName credit_applications
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreditApplicationsDTO implements Serializable {
    /**
     * 申请编号
     */
    private Integer applicationId;

    /**
     * 进件编号
     */
    private String entryId;

    /**
     * 客户号
     */
    private Integer clientNumber;

    /**
     * 产品号
     */
    private Integer productNumber;

    /**
     * 信用等级
     */
    private Integer creditRating;

    /**
     * 授信金额 (元)
     */
    private BigDecimal creditAmount;

    /**
     * 授信有效期 (月)
     */
    private Integer creditValidityPeriod;

    /**
     * 授信生效日
     */
    private Date creditEffectiveDate;

    /**
     * 贷款金额(元)
     */
    private BigDecimal loanAmount;

    /**
     * 期限类型
     */
    private Integer termType;

    /**
     * 贷款期限
     */
    private Integer loanTerm;

    /**
     * 客户经理
     */
    private Long clientManager;

    /**
     * 申请日期
     */
    private Date applicationDate;

    /**
     * 主管网点
     */
    private String mainNetPoint;

    /**
     * 审批状态（0、未审批）
     */
    private Integer approvalStatus;

    /**
     * 审批人
     */
    private String assignee;

    /**
     * 审批意见
     */
    private String advice;
}