package com.uniview.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.user.pojo.Customer;
import com.uniview.user.service.CustomerService;
import com.uniview.user.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author kurtlee
* @description 针对表【customer】的数据库操作Service实现
* @createDate 2024-08-28 14:35:05
*/
@Service
public class CustomerServiceImpl extends ServiceImpl<CustomerMapper, Customer>
    implements CustomerService{

    @Override
    public List<Customer> getCustomersByType(int customerType) {
        // 使用 MyBatis-Plus 提供的 lambdaQuery 方法
        return lambdaQuery()
                .eq(Customer::getCustomerType, customerType)
                .list();
    }
}




