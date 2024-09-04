package com.uniview.notification.pojo;

import lombok.Data;

/**
 * @author: yuancw
 * @date: Created in 2024/5/28 14:01
 * @modified By:
 */
@Data
public class Notice<T> {
    private String sendTo; // 收件人
    private String title; // 标题
    private T message; // 内容
}
