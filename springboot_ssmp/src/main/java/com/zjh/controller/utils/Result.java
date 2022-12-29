package com.zjh.controller.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;

/**
 * @ClassName: Result
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/7  23:11
 * @Version: 1.0
 */


@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated   //Bean的属性校验  该注解启动校验功能
public class Result {
    private Boolean flag;
    private Object data;
    private String msg;


    public Result(boolean flag){
        this.flag = flag;
    }

    public Result(boolean flag,Object data){
        this.flag = flag;
        this.data = data;
    }

    public Result(String msg){
        this.flag = false;
        this.msg = msg;
    }
}
