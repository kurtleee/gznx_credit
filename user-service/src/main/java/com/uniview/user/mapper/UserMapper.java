package com.uniview.user.mapper;

import com.uniview.user.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【user(用户表)】的数据库操作Mapper
* @createDate 2024-08-28 14:35:05
* @Entity com.uniview.user.pojo.User
*/
@Mapper
public interface UserMapper extends BaseMapper<User> {

}




