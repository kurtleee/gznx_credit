package com.uniview.personal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.pojo.CustomerDetail;
import com.uniview.personal.service.CustomerDetailService;
import com.uniview.personal.mapper.CustomerDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author 22322
* @description 针对表【customer_detail(客户详情表)】的数据库操作Service实现
* @createDate 2024-09-02 10:55:42
*/
@Service
public class CustomerDetailServiceImpl extends ServiceImpl<CustomerDetailMapper, CustomerDetail>
    implements CustomerDetailService {

    @Override
    public ResponseData<?> addCustomerDoc(CustomerDetail customerDetail) {
        save(customerDetail);
        return new ResponseData<>().success();
    }
}




