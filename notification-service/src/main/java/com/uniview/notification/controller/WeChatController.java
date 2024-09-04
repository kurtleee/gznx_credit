package com.uniview.notification.controller;

import com.alibaba.fastjson2.JSONObject;
import com.uniview.notification.pojo.Notice;
import com.uniview.notification.pojo.NoticeBorrower;
import com.uniview.notification.service.NotificationService;
import com.uniview.notification.service.WeChatService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Action;
import java.io.IOException;
import java.util.Map;

/**
 * @author ：luosir
 * @modified By：
 */
@Slf4j
@RestController
@RequestMapping("/weChat")
public class WeChatController {

    @Autowired
    private WeChatService weChatService;

    @PostMapping("/notice")
    public String sendNotice(@RequestBody Notice<NoticeBorrower> noticeData) {
        try {
            String accessToken = weChatService.getAccessToken();
            weChatService.sendMessage(accessToken, WeChatService.TEMPLATE_ID, noticeData);
            return "通知消息发送成功!";
        } catch (IOException e) {
            log.error("发送通知消息出错");
            return "发送通知消息出错.";
        }
    }
}