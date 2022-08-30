package com.example.controller.util;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 *
 */
@RestControllerAdvice
public class ProjectExceptionAdvice {
    @ExceptionHandler
    public R doOtherException(Exception exception){
        exception.printStackTrace();
        return new R("系统繁忙，关机重试");
    }
}
