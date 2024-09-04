package com.uniview.notification.controller;

import com.uniview.notification.pojo.Notice;
import com.uniview.notification.pojo.NoticeBorrower;
import com.uniview.notification.pojo.Notification;
import com.uniview.notification.service.NotificationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.mail.MessagingException;

/**
 * @author ：luosir
 * @modified By：
 */
@Slf4j
@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @PostMapping("/send")
    public void sendSimpleNotification(@RequestBody Notification notification){
        notificationService.sendSimpleNotification(notification);
    }
    @PostMapping("/sendMimeMail")
    public void sendMimeMail(@RequestBody Notification notification){
        try {
            notificationService.sendMimeMail(notification);
        } catch (MessagingException e) {
            log.error("通知失败");
            throw new RuntimeException(e);
        }
    }
    /**
     * 发送催收邮件
     */
    @PostMapping("/sendNoticeSuccessMail")
    public void sendLoanSuccessMail(@RequestBody Notice<NoticeBorrower> notice) {
        notificationService.sendNoticeSuccessMail(notice);
    }
}
