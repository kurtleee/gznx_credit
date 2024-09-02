package com.uniview.personal.feign;

import com.uniview.common.dto.CustomerDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.math.BigDecimal;

/**
 * @Author：lixin
 * @Package：com.uniview.personal.feign
 * @Project：gznx_credit
 * @name：CustomerFeign
 * @Date：2024/9/2 11:18
 * @Filename：CustomerFeign
 * @Description：
 */
@FeignClient(name = "user-server")
public interface CustomerFeign {
    /**
     * 根据身份证号获取客户信息
     * @param idCard
     * @return
     */
    @GetMapping("/getCustomerByIdCard")
    public CustomerDto getCustomerByIdCard(String idCard);

    /**
     * 根据信用评级查询信用额度
     * @param creditRating
     * @return
     */
    @PostMapping("/creditLimitQuery")
    public BigDecimal creditLimitQuery(Integer creditRating);

    /**
     * 根据信用评级查询信用期限
     * @param creditRating
     * @return
     */
    @PostMapping("/creditTermQuery")
    public Integer creditTermQuery(Integer creditRating);
}
