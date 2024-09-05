package com.uniview.workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostLoanDto implements Serializable{
    /**
     * 任务编号
     */
    private Integer id;

    /**
     * 客户号
     */
    private String customerNumber;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 证件类型
     */
    private String identityType;

    /**
     * 证件号码
     */
    private String identityNamber;

    /**
     * 结局金额
     */
    private String loanAmount;

    /**
     * 回访人
     */
    private String callbackPerson;

    /**
     * 任务生成时间
     */
    private Date taskStartTime;

    /**
     * 任务到期时间
     */
    private Date taskEndTime;

    /**
     * 登录时间
     */
    private Date registrationTime;

    /**
     * 任务状态
     */
    private String taskStatus;
    /**
     * 审批状态
     */
    private String approvalStatus;
}
