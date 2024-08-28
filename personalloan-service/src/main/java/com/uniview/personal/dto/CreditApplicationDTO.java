package com.uniview.personal.dto;

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
public class CreditApplicationDTO implements Serializable {
    /**
     * 客户名称
     */
    private String clientName;

    /**
     * 申请编号
     */
    private Integer applicationId;

    /**
     * 进件编号
     */
    private String entryId;


    /**
     * 产品名称
     */
    private String productName;

    /**
     * 信用等级
     */
    private Integer creditRating;


    /**
     * 客户经理姓名
     */
    private String clientManagerName;

    /**
     * 申请日期
     */
    private Date applicationDate;


    /**
     * 审批状态
     */
    private Integer approvalStatus;
}
