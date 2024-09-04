package com.uniview.postloan.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoanDto {
    /**
     * 贷款ID
     */
    private Long loanId;

    /**
     * 客户ID
     */
    private Long customerId;

    /**
     * 贷款金额
     */
    private BigDecimal loanAmount;

    /**
     * 贷款期限(月)
     */
    private Integer loanTerm;

    /**
     * 贷款利率
     */
    private BigDecimal loanInterestRate;

    /**
     * 贷款开始日期
     */
    private Date loanStartDate;

    /**
     * 贷款结束日期
     */
    private Date loanEndDate;

    /**
     * 贷款状态
     */
    private String loanStatus;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;
}
