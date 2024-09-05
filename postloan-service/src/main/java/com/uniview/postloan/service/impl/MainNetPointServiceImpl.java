package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.MainNetPoint;
import com.uniview.postloan.service.MainNetPointService;
import com.uniview.postloan.mapper.MainNetPointMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【main_net_point(网点表)】的数据库操作Service实现
* @createDate 2024-08-31 16:08:24
*/
@Service
public class MainNetPointServiceImpl extends ServiceImpl<MainNetPointMapper, MainNetPoint>
    implements MainNetPointService{

    @Override
    public ResponseData<?> getMainNetPointList(MainNetPoint mainNetPoint) {
        return null;
    }
}




