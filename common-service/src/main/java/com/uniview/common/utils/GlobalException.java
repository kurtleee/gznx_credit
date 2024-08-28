package com.uniview.common.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData<?> exceptionHandler(Exception e){
        e.printStackTrace();
        return new ResponseData<>().fail(ResponseEnum.FAIL);
    }
}
