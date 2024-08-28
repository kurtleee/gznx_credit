package com.uniview.notification.mapper;

import com.uniview.notification.pojo.Notification;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【notification】的数据库操作Mapper
* @createDate 2024-08-28 14:20:32
* @Entity com.uniview.notification.pojo.Notification
*/
@Mapper
public interface NotificationMapper extends BaseMapper<Notification> {

}




