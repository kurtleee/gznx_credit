package com.uniview.personal.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.personal.dto.AssociatedBusinessQueryDTO;
import com.uniview.personal.pojo.AssociatedBusinessInformation;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author 22322
* @description 针对表【associated_business_information(个贷关联业务信息)】的数据库操作Service
* @createDate 2024-09-02 17:14:41
*/
public interface AssociatedBusinessInformationService extends IService<AssociatedBusinessInformation> {
    ResponseData<?> renewal(AssociatedBusinessInformation businessInformation);

    ResponseData<?> getAssociatedBusinessList(AssociatedBusinessQueryDTO associatedBusinessQueryDTO);
}
