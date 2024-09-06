package com.uniview.personal.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.personal.pojo.Contracts;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 22322
* @description 针对表【contracts】的数据库操作Service
* @createDate 2024-09-05 16:05:56
*/
public interface ContractsService extends IService<Contracts> {

    ResponseData<?> findAll();
}
