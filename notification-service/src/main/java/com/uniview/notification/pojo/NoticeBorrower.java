package com.uniview.notification.pojo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author ：luosir
 * @modified By：
 */
@Data
public class NoticeBorrower {
    private String borrower;   // 借款人/贷款人
    private String startTime;  // 借款起始日期
    private String expireTime; //借款到期时间
    private String sendTime; //邮件发送时间
    private String productName; // 信贷业务类别
    private BigDecimal loanPrice; // 贷款本金
    private BigDecimal loanInterest;//贷款利息
}
