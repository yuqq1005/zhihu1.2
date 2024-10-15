package com.example.exception;

import com.example.pojo.Result;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(Exception.class)
public Result handleEception(Exception e){
e.printStackTrace();
return Result.error(StringUtils.hasLength(e.getMessage())?e.getMessage():"操作失败");
//e.getMessage()有些异常对象没有封装这个信息
}
}
