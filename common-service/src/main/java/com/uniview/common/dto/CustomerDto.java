package com.uniview.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

/**
 * @Author: Yuki
 * @Date: 2024/8/28 - 下午7:46
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDto {

        /**
         * 客户ID
         */
        private Long customerId;

        /**
         * 客户名称
         */
        private String customerName;

        /**
         * 客户类型（1: 农户, 2: 个人）
         */
        private Integer customerType;

        /**
         * 证件号码
         */
        private String idNumber;

        /**
         * 联系电话
         */
        private String phoneNumber;

        /**
         * 地址
         */
        private String address;

        /**
         * 信用等级
         */
        private Integer creditRating;

        /**
         * 创建时间
         */
        private Date createdAt;

        /**
         * 更新时间
         */
        private Date updatedAt;

}
