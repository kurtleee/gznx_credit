package com.uniview.postloan.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {
    /**
     * 通知ID
     */
    private Long notificationId;

    /**
     * 标题
     */
    private String title;

    /**
     * 接收人ID
     */
    private Long recipientId;
    /**
     *  收件人
     */

    private String sendTo;
    /**
     * 通知消息内容
     */
    private String message;

    /**
     * 发送时间
     */
    private Date sentTime;

    /**
     * 发送状态
     */
    private String status;

}
