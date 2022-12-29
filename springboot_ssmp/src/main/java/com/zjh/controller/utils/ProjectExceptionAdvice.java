package com.zjh.controller.utils;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @ClassName: ProjectExceptionAdvice
 * @Description: 作为springmvc的异常处理器
 * @author: zjh
 * @date: 2022/12/26  23:20
 * @Version: 1.0
 */

/*

 */
@RestControllerAdvice
public class ProjectExceptionAdvice {

    //拦截所有的异常信息
    @ExceptionHandler(Exception.class)  //处理什么异常由此决定
    public Result doException(Exception ex){
        //记录日志
        //通知运维
        //通知开发
        ex.printStackTrace();  //控制台的信息要显示！
        return new Result(false,ex.getMessage());
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Result doValidException(MethodArgumentNotValidException ex){
        ex.printStackTrace();  //控制台的信息要显示！
        return new Result("数据格式校验错误!");
    }
}
