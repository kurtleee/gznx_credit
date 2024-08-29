package com.uniview.notification.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：luosir
 * @modified By：
 */
@Configuration
public class NotificationConfig {

    @Value("${spring.mail.username}")
    private String notificationForm;

    public String getNotificationForm() {
        return notificationForm;
    }

    public void setNotificationForm(String notificationForm) {
        this.notificationForm = notificationForm;
    }
}
