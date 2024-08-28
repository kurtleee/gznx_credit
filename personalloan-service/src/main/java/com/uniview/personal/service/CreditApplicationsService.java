package com.uniview.personal.service;

import com.uniview.personal.dto.CreditApplicationDTO;
import com.uniview.personal.pojo.CreditApplications;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
* @author kurtlee
* @description 针对表【credit_applications】的数据库操作Service
* @createDate 2024-08-28 14:47:29
*/
public interface CreditApplicationsService extends IService<CreditApplications> {

    List<CreditApplications> getApplications(CreditApplicationDTO creditApplicationDTO);
}
