package com.kuang.store.product.exception;

import com.kuang.common.utils.R;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/*
* 集中处理所有异常
* */
@RestControllerAdvice(basePackages = "com.kuang.product.controller")
public class StoreExceptionControllerAdvice {
    @ExceptionHandler(value = Exception.class)
    public R handleException(Exception e){
        return R.error();
    }
}
