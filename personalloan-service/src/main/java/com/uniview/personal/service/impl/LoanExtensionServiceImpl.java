package com.uniview.personal.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.uniview.common.utils.ParamData;
import com.uniview.common.utils.ResponseData;
import com.uniview.personal.dto.ApplicationResponseDTO;
import com.uniview.personal.pojo.LoanExtension;
import com.uniview.personal.service.LoanExtensionService;
import com.uniview.personal.mapper.LoanExtensionMapper;
import org.springframework.stereotype.Service;

/**
* @author 22322
* @description 针对表【loan_extension】的数据库操作Service实现
* @createDate 2024-08-28 16:59:26
*/
@Service
public class LoanExtensionServiceImpl extends ServiceImpl<LoanExtensionMapper, LoanExtension>
    implements LoanExtensionService{

    /**
     * 查询展期列表
     * @param paramData
     * @return
     */
    @Override
    public ResponseData<?> findAll(ParamData<?> paramData) {
        PageHelper.startPage(paramData.getPage(),paramData.getSize());
        PageInfo<LoanExtension> pageInfo =new PageInfo<>(list());
        return new ResponseData<>().success(pageInfo);
    }

    /**
     * 根据IOU查询借款延期申请
     * @param iou
     * @return
     */
    @Override
    public ResponseData<?> findByIOU(String iou) {
        return new ResponseData<>().success(getById(iou));
    }
}




