package com.uniview.notification.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

//import com.uniview.notification.config.NotificationConfig;
import com.uniview.notification.config.NotificationConfig;
import com.uniview.notification.pojo.Notification;
import com.uniview.notification.service.NotificationService;
import com.uniview.notification.mapper.NotificationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import javax.security.auth.Subject;

/**
 * @author kurtlee
 * @description 针对表【notification】的数据库操作Service实现
 * @createDate 2024-08-28 14:20:32
 */
@Service
public class NotificationServiceImpl extends ServiceImpl<NotificationMapper, Notification>
        implements NotificationService {

    @Autowired
    private NotificationConfig notificationConfig;
    @Autowired
    private JavaMailSender mailSender;


    //    private String subject ="邮件标题";
//    private String content ="邮件正文";
//    private String to = "18098779353@163.com";
//    private String from = to;
    @Override
    public void sendSimpleNotification(Notification notification) {
        //简单邮件的发送
        SimpleMailMessage mail = new SimpleMailMessage();
//        mail.setSubject(subject);
//        mail.setText(content);
//        mail.setTo(to);
//        mail.setFrom(from);
//        mailSender.send(mail);
//        System.out.println("邮件发送完毕!");
        mail.setFrom(notificationConfig.getNotificationForm());
        mail.setTo(notification.getSendTo());
        mail.setSubject(notification.getTitle());
        mail.setText(notification.getMessage());
        mailSender.send(mail);
        System.out.println("邮件发送完毕!");
    }
}




