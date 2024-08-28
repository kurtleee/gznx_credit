package com.uniview.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParamData<T> {
    private Integer page;
    private Integer size;
    private T param;
}
