package com.uniview.postloan.feign;

import com.uniview.common.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 调用customer的Feign接口
 */
@FeignClient(name = "user-service", url = "http://localhost:8082")
public interface CustomerFeign {
    @GetMapping("/customer")
    CustomerDto getCustomerById(@PathVariable("customerId")Long customerId);
}
