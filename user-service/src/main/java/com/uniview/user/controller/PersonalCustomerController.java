package com.uniview.user.controller;

import com.uniview.user.pojo.Customer;
import com.uniview.user.pojo.User;
import com.uniview.user.service.CustomerService;
import com.uniview.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

/**
 * @Author：lixin
 * @Package：com.uniview.user.controller
 * @Project：gznx_credit
 * @name：PersonalCustomer
 * @Date：2024/9/2 11:12
 * @Filename：PersonalCustomer
 * @Description：
 */
@RestController
public class PersonalCustomerController {
    @Autowired
    private CustomerService customerService;
    @Autowired
    private UserService userService;

    /**
     * 根据身份证号获取客户信息
     *
     * @param idCard
     * @return
     */
    @GetMapping("/getCustomerByIdCard")
    public Customer getCustomerByIdCard(String idCard) {
        return customerService.getCustomerByIdCard(idCard);
    }

    /**
     * 根据信用等级查询信用额度
     *
     * @param creditRating
     * @return
     */
    @PostMapping("/creditLimitQuery")
    public BigDecimal creditLimitQuery(Integer creditRating) {
        // TODO: 根据信用等级查询信用额度
        return customerService.getCreditLimit(creditRating);
    }

    /**
     * 根据信用等级查询授信有效期
     *
     * @param creditRating
     * @return
     */
    @PostMapping("/creditTermQuery")
    public Integer creditTermQuery(Integer creditRating) {
        // TODO: 根据信用等级查询授信有效期
        return customerService.getCreditTerm(creditRating);
    }

    @GetMapping("getUserById")
    public User getUserById(Long id) {
        return userService.getUserById(id);
    }

}
