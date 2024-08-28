package com.uniview.notification.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.notification.pojo.Notification;
import com.uniview.notification.service.NotificationService;
import com.uniview.notification.mapper.NotificationMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【notification】的数据库操作Service实现
* @createDate 2024-08-28 14:20:32
*/
@Service
public class NotificationServiceImpl extends ServiceImpl<NotificationMapper, Notification>
    implements NotificationService{

}




