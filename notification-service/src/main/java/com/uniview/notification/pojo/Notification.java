package com.uniview.notification.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @TableName notification
 */
@Data
public class Notification implements Serializable {
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
     * 收件人
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