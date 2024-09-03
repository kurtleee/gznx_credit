package com.uniview.personal.service;

import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.dto.ApplicationQueryDTO;
import com.uniview.personal.dto.ApplyApplicationDTO;
import com.uniview.personal.pojo.AssociatedBusinessInformation;
import com.uniview.personal.pojo.CreditApplications;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 22322
* @description 针对表【credit_applications(业务申请表)】的数据库操作Service
* @createDate 2024-09-02 12:29:20
*/
public interface CreditApplicationsService extends IService<CreditApplications> {

    ResponseData<?> getApplications(ParamData<ApplicationQueryDTO> paramData);

    ResponseData<?> applyApplications(ApplyApplicationDTO applyApplicationDTO);


}
