package com.uniview.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.user.pojo.User;
import com.uniview.user.service.UserService;
import com.uniview.user.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author kurtlee
* @description 针对表【user(用户表)】的数据库操作Service实现
* @createDate 2024-08-28 14:35:05
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public User getUserById(Long id) {
        return getById(id);
    }
}




