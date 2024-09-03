package com.uniview.personal.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.personal.pojo.CustomerDetail;
import com.uniview.personal.service.CustomerDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author：lixin
 * @Package：com.uniview.personal.controller
 * @Project：gznx_credit
 * @name：CustomerDocumentationController
 * @Date：2024/9/2 10:46
 * @Filename：CustomerDocumentationController
 * @Description：
 */
@RestController
@RequestMapping("/customerDoc")
public class CustomerDocumentationController {
    @Autowired
    private CustomerDetailService detailService;

    /**
     * 客户建档
     */
    @PostMapping("/addCustomerDoc")
    public ResponseData<?> addCustomerDoc(@RequestBody CustomerDetail customerDetail) {
        return detailService.addCustomerDoc(customerDetail);
    }
}
