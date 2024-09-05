package com.uniview.postloan.controller;

import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.PostloanCallbackDetail;
import com.uniview.postloan.pojo.PostloanFollowupList;
import com.uniview.postloan.service.PostloanFollowupListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

/**
 * 贷后回访主列表
 */
@RestController
@RequestMapping("/postloan-followup-list")
public class PostloanFollowupListController {
    @Autowired
    private PostloanFollowupListService followupListService;

    //获取回访列表
//    @PostMapping("/getCallbackList")
//    public ResponseData<?> getCallbackList(@RequestBody PostloanFollowupList postloanFollowupList) {
//        return followupListService.getFollowupList(postloanFollowupList);
//    }
//    //添加回访记录
//    @PostMapping("/addFollowupRecord")
//    public ResponseData<?> addFollowupRecord(@RequestBody PostloanFollowupList postloanFollowupList) {
//        return followupListService.addFollowupRecord(postloanFollowupList);
//    }
//    //修改回访详情
//    @PostMapping("/updateFollowupDetail")
//    public ResponseData<?> updateFollowupDetail(@RequestBody PostloanFollowupList followupList) {
//        return followupListService.updateFollowupDetail(followupList);
//    }
    @GetMapping("/getFollowupList")

    public ResponseData<?> getFollowupList() {
        return followupListService.getFollowupList();
    }

    @PostMapping("/updateStatus")
    public ResponseData<?> updateStatus(@RequestBody PostloanFollowupList postloanFollowupList) {
         followupListService.updateById(postloanFollowupList);
         return new ResponseData<>().success();
    }

}
