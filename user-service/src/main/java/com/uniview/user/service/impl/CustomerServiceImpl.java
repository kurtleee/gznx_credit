package com.uniview.user.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.user.pojo.Customer;
import com.uniview.user.service.CustomerService;
import com.uniview.user.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    /**
     * 根据身份证号获取客户信息
     * @param idCard
     * @return
     */
    @Override
    public Customer getCustomerByIdCard(String idCard) {
        return lambdaQuery()
                .eq(Customer::getIdNumber, idCard).one();
    }

    /**
     * 根据信用等级获取信用额度
     * @param creditRating
     * @return
     */
    @Override
    public BigDecimal getCreditLimit(Integer creditRating) {
        switch (creditRating) {
            case 1:
                return new BigDecimal("50000");
            case 2:
                return new BigDecimal("100000");
            case 3:
                return new BigDecimal("200000");
            case 4:
                return new BigDecimal("500000");
            case 5:
                return new BigDecimal("1000000");
            default:
                return new BigDecimal("0");
        }
    }

    @Override
    public Integer getCreditTerm(Integer creditRating) {
        switch (creditRating) {
            case 1:
                return 12;
            case 2:
                return 18;
            case 3:
                return 24;
            case 4:
                return 36;
            case 5:
                return 48;
            default:
                return 0;
        }
    }
}




