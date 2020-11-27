package com.smalleast.exception;

import com.smalleast.utils.BaseResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.support.DefaultMessageSourceResolvable;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
* validate校验 异常统一捕捉处理类
*/
@ControllerAdvice
public class WebExceptionHandler {

    /**
     * 处理请求参数格式错误
     * @RequestBody上validate失败后抛出的异常是MethodArgumentNotValidException异常
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public BaseResponse MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException e) {
        Map<String, String> result = getErrorsMap(e.getBindingResult().getAllErrors());
        return BaseResponse.error("参数校验错误", result);
    }

    /**
     * 处理Get请求中
     * 使用@Valid 验证路径中请求实体校验失败后抛出的异常
     */
    @ExceptionHandler(BindException.class)
    @ResponseBody
    public BaseResponse BindExceptionHandler(BindException e) {
        // String message = e.getBindingResult().getAllErrors().stream().map(DefaultMessageSourceResolvable::getDefaultMessage).collect(Collectors.joining());
        Map<String, String> result = getErrorsMap(e.getBindingResult().getAllErrors());
        return BaseResponse.error("参数校验错误", result);
    }

    /**
     * 处理请求参数格式错误
     * @RequestParam上validate失败后抛出的异常是ConstraintViolationException
     */
    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseBody
    public BaseResponse ConstraintViolationExceptionHandler(ConstraintViolationException e) {
        // String message = e.getConstraintViolations().stream().map(ConstraintViolation::getMessage).collect(Collectors.joining());



        Set<ConstraintViolation<?>> constraintViolations = e.getConstraintViolations();
        Map<String, String> result;
        result = constraintViolations.stream()
                .collect(Collectors.toMap(con -> con.getPropertyPath().toString().split("\\.")[1], con -> con.getMessage()));

        return BaseResponse.error("参数校验错误", result);
    }

    private Map<String, String> getErrorsMap(List<ObjectError> errors) {
        Map<String, String> result = new HashMap<String, String>();
        for (ObjectError i : errors) {
            String key = null;
            String msg = null;
            // 字段错误
            if (i instanceof FieldError) {
                FieldError fe = (FieldError) i;
                // 获取错误验证字段名
                key = fe.getField();
            } else {
                // 非字段错误
                // 获取验证对象名称
                key = i.getObjectName();
            }
            // 错误信息

            msg = i.getDefaultMessage();
            result.put(key, msg);
        }
        return result;
    }

}
