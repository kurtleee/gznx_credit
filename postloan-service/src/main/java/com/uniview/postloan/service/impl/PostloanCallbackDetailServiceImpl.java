package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.PostloanCallbackDetail;
import com.uniview.postloan.service.PostloanCallbackDetailService;
import com.uniview.postloan.mapper.PostloanCallbackDetailMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【postloan_callback_detail(贷后回访详情表)】的数据库操作Service实现
* @createDate 2024-08-31 16:08:34
*/
@Service
public class PostloanCallbackDetailServiceImpl extends ServiceImpl<PostloanCallbackDetailMapper, PostloanCallbackDetail>
    implements PostloanCallbackDetailService{

    @Override
    public ResponseData<?> getCallbackDetail(PostloanCallbackDetail postloanCallbackDetail) {
        return null;
    }

    @Override
    public ResponseData<?> addCallbackDetail(PostloanCallbackDetail callbackDetail) {
        return null;
    }

    @Override
    public ResponseData<?> updateCallbackDetail(PostloanCallbackDetail callbackDetail) {
        return null;
    }
}




