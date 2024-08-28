package com.uniview.notification.notification;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName notification
 */
@TableName(value ="notification")
public class Notification implements Serializable {
    /**
     * 通知ID
     */
    @TableId(type = IdType.AUTO)
    private Long notificationId;

    /**
     * 接收人ID
     */
    private Long recipientId;

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

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    /**
     * 通知ID
     */
    public Long getNotificationId() {
        return notificationId;
    }

    /**
     * 通知ID
     */
    public void setNotificationId(Long notificationId) {
        this.notificationId = notificationId;
    }

    /**
     * 接收人ID
     */
    public Long getRecipientId() {
        return recipientId;
    }

    /**
     * 接收人ID
     */
    public void setRecipientId(Long recipientId) {
        this.recipientId = recipientId;
    }

    /**
     * 通知消息内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * 通知消息内容
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 发送时间
     */
    public Date getSentTime() {
        return sentTime;
    }

    /**
     * 发送时间
     */
    public void setSentTime(Date sentTime) {
        this.sentTime = sentTime;
    }

    /**
     * 发送状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 发送状态
     */
    public void setStatus(String status) {
        this.status = status;
    }

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
        Notification other = (Notification) that;
        return (this.getNotificationId() == null ? other.getNotificationId() == null : this.getNotificationId().equals(other.getNotificationId()))
            && (this.getRecipientId() == null ? other.getRecipientId() == null : this.getRecipientId().equals(other.getRecipientId()))
            && (this.getMessage() == null ? other.getMessage() == null : this.getMessage().equals(other.getMessage()))
            && (this.getSentTime() == null ? other.getSentTime() == null : this.getSentTime().equals(other.getSentTime()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNotificationId() == null) ? 0 : getNotificationId().hashCode());
        result = prime * result + ((getRecipientId() == null) ? 0 : getRecipientId().hashCode());
        result = prime * result + ((getMessage() == null) ? 0 : getMessage().hashCode());
        result = prime * result + ((getSentTime() == null) ? 0 : getSentTime().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", notificationId=").append(notificationId);
        sb.append(", recipientId=").append(recipientId);
        sb.append(", message=").append(message);
        sb.append(", sentTime=").append(sentTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}