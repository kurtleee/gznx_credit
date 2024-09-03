package com.uniview.personal.mapper;

import com.uniview.personal.dto.ApplicationQueryDTO;
import com.uniview.personal.dto.ApplicationResponseDTO;
import com.uniview.personal.pojo.CreditApplications;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author 22322
* @description 针对表【credit_applications(业务申请表)】的数据库操作Mapper
* @createDate 2024-09-02 12:29:19
* @Entity com.uniview.personal.pojo.CreditApplications
*/
public interface CreditApplicationsMapper extends BaseMapper<CreditApplications> {
    List<ApplicationResponseDTO> getApplications(ApplicationQueryDTO applicationQueryDTO);
}




