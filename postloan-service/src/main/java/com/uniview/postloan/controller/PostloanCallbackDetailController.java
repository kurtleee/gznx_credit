package com.uniview.postloan.controller;


import com.uniview.common.utils.ResponseData;
import com.uniview.postloan.pojo.PostloanCallbackDetail;
import com.uniview.postloan.service.PostloanCallbackDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 贷后回访详情Controller
 */
@RestController
@RequestMapping("/callbackDetail")
public class PostloanCallbackDetailController {
    @Autowired
    private PostloanCallbackDetailService callbackDetailService;
    //查询贷后回访详情
    @PostMapping("/getCallbackDetail")
    public ResponseData<?> getCallbackDetail(@RequestBody PostloanCallbackDetail postloanCallbackDetail) {
        return callbackDetailService.getCallbackDetail(postloanCallbackDetail);
    }
    //添加回访记录
    @PostMapping("/addCallbackDetail")
    public ResponseData<?> addCallbackDetail(@RequestBody PostloanCallbackDetail callbackDetail) {
        return callbackDetailService.addCallbackDetail(callbackDetail);
    }
    //修改回访主列表（可能不需要）
    @PostMapping("/updateCallbackDetail")
    public ResponseData<?> updateCallbackDetail(@RequestBody PostloanCallbackDetail callbackDetail) {
        return callbackDetailService.updateCallbackDetail(callbackDetail);
    }
}
