package com.uniview.personal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.pojo.Contracts;
import com.uniview.personal.service.ContractsService;
import com.uniview.personal.mapper.ContractsMapper;
import org.springframework.stereotype.Service;

/**
* @author 22322
* @description 针对表【contracts】的数据库操作Service实现
* @createDate 2024-09-05 16:05:56
*/
@Service
public class ContractsServiceImpl extends ServiceImpl<ContractsMapper, Contracts>
    implements ContractsService{

    @Override
    public ResponseData<?> findAll() {
        return new ResponseData<>().success(list());
    }
}




