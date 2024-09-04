package com.uniview.common.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @ClassNAME ActDto
 * @Description TODO
 * @Author yangqidi
 * @Date 2024/4/7 14:25
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActDto {
    private Long userId; //流程发起人的ID
    private Map<String,Object> map;//流程变量的Map对象，其中key代表变量名，value代表变量值。
    private String key;//流程定义的key，用于指定启动哪个流程定义。通常情况下，一个流程定义对应一个唯一的key
}
