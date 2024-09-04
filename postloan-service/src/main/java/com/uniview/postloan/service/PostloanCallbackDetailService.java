package com.uniview.postloan.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.PostloanCallbackDetail;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【postloan_callback_detail(贷后回访详情表)】的数据库操作Service
* @createDate 2024-08-31 16:08:34
*/
public interface PostloanCallbackDetailService extends IService<PostloanCallbackDetail> {

    ResponseData<?> getCallbackDetail(PostloanCallbackDetail postloanCallbackDetail);

    ResponseData<?> addCallbackDetail(PostloanCallbackDetail callbackDetail);

    ResponseData<?> updateCallbackDetail(PostloanCallbackDetail callbackDetail);
}
