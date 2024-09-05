package com.uniview.postloan.mapper;

import com.uniview.postloan.pojo.LitigationManagement;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
* @author Administrator
* @description 针对表【litigation_management(诉讼管理表)】的数据库操作Mapper
* @createDate 2024-09-03 11:09:09
* @Entity com.uniview.postloan.pojo.LitigationManagement
*/
public interface LitigationManagementMapper extends BaseMapper<LitigationManagement> {
    void insertLitigationManagement(LitigationManagement litigationManagement);
    LitigationManagement findLitigationById(int litigationId);
    List<LitigationManagement> findLitigationByCaseId(int caseId);
    void updateLitigationStatus(int litigationId, String status);

//    void initiateLitigation(LitigationManagement litigation);
}




