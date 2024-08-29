package com.uniview.notification.controller;

import com.uniview.notification.pojo.Notification;
import com.uniview.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：luosir
 * @modified By：
 */
@RestController
@RequestMapping("/notification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;
    @PostMapping("/send")
    public void sendSimpleNotification(@RequestBody Notification notification){
        notificationService.sendSimpleNotification(notification);
    }
}
