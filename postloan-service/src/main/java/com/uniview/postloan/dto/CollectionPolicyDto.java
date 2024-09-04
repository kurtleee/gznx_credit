package com.uniview.postloan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 催收规则管理dto
 * 用于条件查询
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CollectionPolicyDto {

    /**
     * 催收类型（1：轻度逾期，2：中度逾期、3:重度逾期）
     */
    private String taskType;

    /**
     * 催收方式：1:短信、2：电话、3：自动扣款、4：上门访问、5：诉讼
     */
    private String taskMethods;

    /**
     * 规则状态（1：生效、2：失效）
     */
    private Integer ruleStatus;

    /**
     * 规则编号
     */
    private String ruleNumber;

}
