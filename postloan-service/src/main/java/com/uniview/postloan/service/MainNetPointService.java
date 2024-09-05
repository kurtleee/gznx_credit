package com.uniview.postloan.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.MainNetPoint;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【main_net_point(网点表)】的数据库操作Service
* @createDate 2024-08-31 16:08:24
*/
public interface MainNetPointService extends IService<MainNetPoint> {

    ResponseData<?> getMainNetPointList(MainNetPoint mainNetPoint);
}
