package com.uniview.user.service;

import com.uniview.user.pojo.Customer;
import com.baomidou.mybatisplus.extension.service.IService;

import java.math.BigDecimal;
import java.util.List;

/**
* @author kurtlee
* @description 针对表【customer】的数据库操作Service
* @createDate 2024-08-28 14:35:05
*/
public interface CustomerService extends IService<Customer> {

    /**
     * 根据客户类型查询客户信息
     * @param customerType
     * @return
     */
    List<Customer> getCustomersByType(int customerType);

    Customer getCustomerByIdCard(String idCard);

    BigDecimal getCreditLimit(Integer creditRating);

    Integer getCreditTerm(Integer creditRating);
}
