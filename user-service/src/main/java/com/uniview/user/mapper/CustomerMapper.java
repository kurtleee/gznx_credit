package com.uniview.user.mapper;

import com.uniview.user.pojo.Customer;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author kurtlee
* @description 针对表【customer】的数据库操作Mapper
* @createDate 2024-08-28 14:35:05
* @Entity com.uniview.user.pojo.Customer
*/
@Mapper
public interface CustomerMapper extends BaseMapper<Customer> {

}




