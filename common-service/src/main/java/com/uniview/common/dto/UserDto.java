package com.uniview.common.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表
 * @TableName user
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto implements Serializable {
    /**
     * 用户ID
     */

    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 电子邮件
     */
    private String email;

    /**
     * 手机号
     */
    private String phoneNumber;

    /**
     * 所在城市
     */
    private String city;

    /**
     * 所属支行
     */
    private String branch;

    /**
     * 职位（1: 职员, 2: 经理, 3: 行长）
     */
    private Integer position;

    /**
     * 创建时间
     */
    private Date createdAt;

    /**
     * 更新时间
     */
    private Date updatedAt;

}