package com.uniview.personal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.dto.AssociatedBusinessQueryDTO;
import com.uniview.personal.pojo.AssociatedBusinessInformation;
import com.uniview.personal.service.AssociatedBusinessInformationService;
import com.uniview.personal.mapper.AssociatedBusinessInformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* @author 22322
* @description 针对表【associated_business_information(个贷关联业务信息)】的数据库操作Service实现
* @createDate 2024-09-02 17:14:41
*/
@Service
public class AssociatedBusinessInformationServiceImpl extends ServiceImpl<AssociatedBusinessInformationMapper, AssociatedBusinessInformation>
    implements AssociatedBusinessInformationService{

    @Autowired
    private AssociatedBusinessInformationMapper associatedBusinessInformationMapper;
    /**
     * 续贷申请
     * @param businessInformation
     * @return
     */
    @Override
    public ResponseData<?> renewal(AssociatedBusinessInformation businessInformation) {
        return null;
    }

    @Override
    public ResponseData<?> getAssociatedBusinessList(AssociatedBusinessQueryDTO associatedBusinessQueryDTO) {
        List<AssociatedBusinessInformation> associatedBusinessList = associatedBusinessInformationMapper.getAssociatedBusinessList(associatedBusinessQueryDTO);
        return new ResponseData<>().success(associatedBusinessList);
    }

}




