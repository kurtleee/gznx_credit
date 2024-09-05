package com.uniview.user.controller;

import com.uniview.user.pojo.Customer;
import com.uniview.user.service.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: Yuki
 * @Date: 2024/8/28 - 下午4:39
 */
@RestController
@Api(tags = "农业客户管理")
public class AgricultureCustomer {

    @Autowired
    private CustomerService customerService;

    /**
     * 根据客户类型查询农业客户信息
     * @return 农户客户列表
     */
    @ApiOperation(value = "获取所有农户客户")
    @GetMapping("/acustomer")
    public List<Customer> getAgricultureCustomers() {
        // 调用服务层方法获取 customerType 为 1 的客户列表
        return customerService.getCustomersByType(1);
    }

    /**
     * 根据客户ID查询客户信息
     * @param customerId
     * @return
     */
    @GetMapping("/customer")
    public Customer getCustomers(Long customerId) {
        return customerService.getCustomerById(customerId);
    }
}
