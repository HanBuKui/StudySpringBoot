package com.zjh.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MyBean
 * @Description: Spring Task执行定时任务
 * @author: zjh
 * @date: 2023/1/8  14:31
 * @Version: 1.0
 */

@Component
public class MyBean {

    @Scheduled(cron = "0/5 * * * * ?")  //设定执行周期
    public void printlog(){  //设置定时执行的任务
        System.out.println(Thread.currentThread().getName()+":spring task run..");
    }

}
