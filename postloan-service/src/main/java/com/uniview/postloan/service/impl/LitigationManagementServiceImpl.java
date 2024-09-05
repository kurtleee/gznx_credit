package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.LitigationManagement;
import com.uniview.postloan.service.LitigationManagementService;
import com.uniview.postloan.mapper.LitigationManagementMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【litigation_management(诉讼管理表)】的数据库操作Service实现
* @createDate 2024-09-03 11:09:09
*/
@Service
public class LitigationManagementServiceImpl extends ServiceImpl<LitigationManagementMapper, LitigationManagement>
    implements LitigationManagementService{

    @Override
    public ResponseData<?> getLitigationManagementList() {
        return new ResponseData<>().success(list());
    }
}




