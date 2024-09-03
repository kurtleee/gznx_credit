package com.uniview.personal.mapper;

import com.uniview.personal.dto.AssociatedBusinessQueryDTO;
import com.uniview.personal.pojo.AssociatedBusinessInformation;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 22322
* @description 针对表【associated_business_information(个贷关联业务信息)】的数据库操作Mapper
* @createDate 2024-09-02 17:14:41
* @Entity com.uniview.personal.pojo.AssociatedBusinessInformation
*/
public interface AssociatedBusinessInformationMapper extends BaseMapper<AssociatedBusinessInformation> {

    List<AssociatedBusinessInformation> getAssociatedBusinessList(AssociatedBusinessQueryDTO associatedBusinessQueryDTO);
}




