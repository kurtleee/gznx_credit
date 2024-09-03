package com.uniview.personal.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.personal.pojo.CustomerDetail;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 22322
* @description 针对表【customer_detail(客户详情表)】的数据库操作Service
* @createDate 2024-09-02 10:55:42
*/
public interface CustomerDetailService extends IService<CustomerDetail> {

    ResponseData<?> addCustomerDoc(CustomerDetail customerDetail);
}
