package com.uniview.personal.service;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.pojo.LoanExtension;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 22322
* @description 针对表【loan_extension】的数据库操作Service
* @createDate 2024-08-28 16:59:26
*/
public interface LoanExtensionService extends IService<LoanExtension> {

    ResponseData<?> findAll(ParamData<?> paramData);

    ResponseData<?> findByIOU(String iou);
}
