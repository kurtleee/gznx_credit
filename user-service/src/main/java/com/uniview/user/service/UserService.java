package com.uniview.user.service;

import com.uniview.user.pojo.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author kurtlee
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2024-08-28 14:35:05
*/
public interface UserService extends IService<User> {

    User getUserById(Long id);
}
