package com.uniview.notification.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.uniview.notification.config.NotificationConfig;
import com.uniview.notification.pojo.Notice;
import com.uniview.notification.pojo.NoticeBorrower;
import com.uniview.notification.pojo.Notification;
import com.uniview.notification.service.NotificationService;
import com.uniview.notification.mapper.NotificationMapper;
import com.uniview.notification.util.NoticeSuccessUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

/**
 * @author kurtlee
 * @description 针对表【notification】的数据库操作Service实现
 * @createDate 2024-08-28 14:20:32
 */
@Slf4j
@Service
public class NotificationServiceImpl extends ServiceImpl<NotificationMapper, Notification>
        implements NotificationService {

    @Autowired
    private NotificationConfig notificationConfig;
    @Autowired
    private JavaMailSender mailSender;

    @Override
    public void sendSimpleNotification(Notification notification) {
        //简单邮件的发送
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setFrom(notificationConfig.getNotificationForm());
        mail.setTo(notification.getSendTo());
        mail.setSubject(notification.getTitle());
        mail.setText(notification.getMessage());
        mailSender.send(mail);
        System.out.println("邮件发送完毕!");
    }


    public void sendMimeMail(Notification notification) throws MessagingException {
        MimeMessage mail = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mail,true);
        helper.setSubject(notification.getTitle());
        helper.setText(notification.getMessage());
        helper.setFrom(notificationConfig.getNotificationForm());
        helper.setTo(notification.getSendTo());
        File file = new File("C:\\Users\\11414\\Desktop\\附件5.docx");
        helper.addAttachment(file.getName(), file);
        mailSender.send(mail);
        System.out.println("邮件发送完毕!");
    }

    @Override
    public void sendNoticeSuccessMail(Notice<NoticeBorrower> notice) {
        MimeMessage mimeMailMessage = null;
        try {
            mimeMailMessage = mailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMailMessage, true);
            mimeMessageHelper.setFrom(notificationConfig.getNotificationForm());
            mimeMessageHelper.setTo(notice.getSendTo());
            mimeMessageHelper.setSubject(notice.getTitle());

            TemplateEngine templateEngine = new TemplateEngine();
            NoticeSuccessUtil noticeSuccessUtil = new NoticeSuccessUtil(templateEngine);
            String loanSuccessHtml = noticeSuccessUtil.generateNoticeSuccessHtml(notice.getMessage());
            mimeMessageHelper.setText(loanSuccessHtml, true);
            mailSender.send(mimeMailMessage);
            log.info("邮件发送成功");
        } catch (Exception e) {
            log.error("邮件发送失败{}", e);
        }
    }
}




