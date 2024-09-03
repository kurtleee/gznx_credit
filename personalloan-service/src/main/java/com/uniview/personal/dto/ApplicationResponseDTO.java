package com.uniview.personal.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Author：lixin
 * @Package：com.uniview.personal.dto
 * @Project：gznx_credit
 * @name：CreditApplicationDTO
 * @Date：2024/8/28 19:36
 * @Filename：CreditApplicationDTO
 * @Description：
 */
public class ApplicationResponseDTO implements Serializable {
    /**
     * 申请编号
     */
    private Integer applicationId;

    /**
     * 进件编号
     */
    private String entryId;

    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 产品名称
     */
    private String  productName;

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
    private String clientManagerName;

    /**
     * 申请日期
     */
    private Date applicationDate;

    /**
     * 主管网点
     */
    private String mainNetPointName;

    /**
     * 审批状态
     */
    private Integer approvalStatus;
}
