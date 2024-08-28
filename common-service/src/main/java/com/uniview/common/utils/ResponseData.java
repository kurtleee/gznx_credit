package com.uniview.common.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseData<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResponseData success() {
        return new ResponseData(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), null);
    }

    public ResponseData success(T data) {
        return new ResponseData(ResponseEnum.SUCCESS.getCode(), ResponseEnum.SUCCESS.getMsg(), data);
    }

    public ResponseData fail(ResponseEnum responseEnum) {
        return new ResponseData(responseEnum.getCode(), responseEnum.getMsg(), null);
    }
}
