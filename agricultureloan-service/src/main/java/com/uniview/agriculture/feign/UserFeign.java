package com.uniview.agriculture.feign;


import com.uniview.common.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: Yuki
 * @Date: 2024/8/28 - 下午7:42
 */
@FeignClient(name = "user-service")
public interface UserFeign {
    /**
     * 查询所有农户客户
     */
    @GetMapping("/acustomer")
    List<CustomerDto> getAgricultureCustomers();
}
