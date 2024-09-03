package com.uniview.personal.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
/**
 * 申请向导
 */
public class ApplyApplicationDTO implements Serializable {
    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 客户类型
     */
    private Integer customerType;

    /**
     * 身份证号
     */
    private String idNumber;

    /**
     * 产品名称
     */
    private String productName;

    /**
     * 客户经理编号
     */
    private Long managerNumber;
}
