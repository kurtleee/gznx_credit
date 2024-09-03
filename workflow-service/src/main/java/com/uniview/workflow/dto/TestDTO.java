package com.uniview.workflow.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author ：zx
 * @date ：Created in 2024/9/2 22:17
 * @description：申请信息的对象，其中应该有审批状态的字段，如果状态为不通过应该有不通过的原因，还有审批人字段
 * @modified By：
 * @version:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestDTO implements Serializable {
    private Integer id;
    private String name;
    private Date birthday;
}
