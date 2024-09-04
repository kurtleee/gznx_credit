package com.uniview.notification.service;

import com.uniview.notification.pojo.Notice;
import com.uniview.notification.pojo.NoticeBorrower;
import com.uniview.notification.pojo.Notification;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.mail.MessagingException;

/**
* @author kurtlee
* @description 针对表【notification】的数据库操作Service
* @createDate 2024-08-28 14:20:32
*/
public interface NotificationService extends IService<Notification> {

    //发送简单的邮件
    void sendSimpleNotification(Notification notification);

    void sendMimeMail(Notification notification) throws MessagingException;
    //发送html的邮件
    void sendNoticeSuccessMail(Notice<NoticeBorrower> notice);
}
