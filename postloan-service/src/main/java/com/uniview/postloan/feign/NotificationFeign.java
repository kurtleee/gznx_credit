package com.uniview.postloan.feign;

import com.uniview.postloan.dto.NotificationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.management.Notification;
@FeignClient(value = "notification-service", url = "http://localhost:8081")
public interface NotificationFeign {
    @PostMapping("/send")
    public void sendSimpleNotification(@RequestBody NotificationDto notification);
}
