package com.uniview.notification.service;

import com.alibaba.fastjson2.JSONObject;
import com.uniview.notification.pojo.Notice;
import com.uniview.notification.pojo.NoticeBorrower;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Map;

/**
 * @author ：luosir
 * @modified By：
 */
@Service
public class WeChatService {

    private static final String APP_ID = "wx7860a4ef2be9a6c8";
    private static final String APP_SECRET = "3676bb20d805ec1d45e47daf9dfa2205";
    public static final String OPEN_ID = "oMBIK6VE8FH-JRtYMvXfRMvC6PUo";
    public static final String TEMPLATE_ID = "pyrgkHSMVa4rUCjWImQRAB-oYo6Sk9RZDdkLb4ULv3M";


    public String getAccessToken() throws IOException {
        String url = String.format("https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=%s&secret=%s", APP_ID, APP_SECRET);
            try (CloseableHttpClient client = HttpClients.createDefault()) {
                HttpGet request = new HttpGet(url);
                try (CloseableHttpResponse response = client.execute(request)) {
                    String responseBody = EntityUtils.toString(response.getEntity());
                    JSONObject json = JSONObject.parseObject(responseBody);
                    if (json.containsKey("access_token")) {
                        return json.getString("access_token");
                    } else {
                        throw new IOException("Failed to retrieve access_token: " + json.getString("errmsg"));
                    }
                }
            }
    }

    public void sendMessage(String accessToken, String templateId, Notice<NoticeBorrower> data) throws IOException {
        String url = String.format("https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=%s", accessToken);
        JSONObject message = new JSONObject();
        message.put("touser", OPEN_ID);
        message.put("template_id", templateId);

        JSONObject messageData = new JSONObject();
        messageData.put("borrower", new JSONObject().fluentPut("value", data.getMessage().getBorrower()));
        messageData.put("startTime", new JSONObject().fluentPut("value", data.getMessage().getStartTime()));
        messageData.put("expireTime", new JSONObject().fluentPut("value", data.getMessage().getExpireTime()));
        messageData.put("sendTime", new JSONObject().fluentPut("value", data.getMessage().getSendTime()));
        messageData.put("productName", new JSONObject().fluentPut("value", data.getMessage().getProductName()));
        messageData.put("loanPrice", new JSONObject().fluentPut("value", data.getMessage().getLoanPrice().toString()));
        messageData.put("loanInterest", new JSONObject().fluentPut("value", data.getMessage().getLoanInterest().toString()));

        message.put("data", messageData); // 修改：将结构化的数据添加到 data 字段中


        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost post = new HttpPost(url);
            StringEntity entity = new StringEntity(message.toString(), "UTF-8");
            post.setEntity(entity);
            post.setHeader("Content-Type", "application/json");
            try (CloseableHttpResponse response = client.execute(post)) {
                String responseBody = EntityUtils.toString(response.getEntity());
                System.out.println("Response: " + responseBody);
            }
        }
    }
}