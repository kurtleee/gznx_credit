package com.uniview.postloan.service;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.PostloanCallbackDetail;
import com.uniview.postloan.pojo.PostloanFollowupList;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【postloan_followup_list(贷后回访主列表)】的数据库操作Service
* @createDate 2024-08-31 16:08:50
*/
public interface PostloanFollowupListService extends IService<PostloanFollowupList> {
    ResponseData<?> getFollowupList(PostloanFollowupList postloanFollowupList);

    ResponseData<?> addFollowupRecord(PostloanFollowupList postloanFollowupList);

    ResponseData<?> updateFollowupDetail(PostloanFollowupList followupList);
}
