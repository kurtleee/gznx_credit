package com.uniview.postloan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.PostloanFollowupList;
import com.uniview.postloan.service.PostloanFollowupListService;
import com.uniview.postloan.mapper.PostloanFollowupListMapper;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【postloan_followup_list(贷后回访主列表)】的数据库操作Service实现
* @createDate 2024-08-31 16:08:50
*/
@Service
public class PostloanFollowupListServiceImpl extends ServiceImpl<PostloanFollowupListMapper, PostloanFollowupList>
    implements PostloanFollowupListService{

    @Override
    public ResponseData<?> getFollowupList(PostloanFollowupList postloanFollowupList) {
        return null;
    }

    @Override
    public ResponseData<?> addFollowupRecord(PostloanFollowupList postloanFollowupList) {
        return null;
    }

    @Override
    public ResponseData<?> updateFollowupDetail(PostloanFollowupList followupList) {
        return null;
    }
}




