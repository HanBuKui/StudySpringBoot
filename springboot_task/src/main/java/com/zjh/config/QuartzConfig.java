package com.zjh.config;

import com.zjh.quartz.MyQuartz;
import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: QuartzConfig
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/7  23:52
 * @Version: 1.0
 */

@Configuration
public class QuartzConfig {

    @Bean
    public JobDetail printJobDetail(){  //JobDetail： 工作明细
        //绑定具体的工作job
        return JobBuilder
                .newJob(MyQuartz.class)
                .storeDurably()
                .build();
    }


    @Bean
    public Trigger printJobTrigger(){   //触发器
        ScheduleBuilder schedBuilder = CronScheduleBuilder.cronSchedule("0/5 * * * * ?");  // cron表达式
        //绑定对应的工作明细
        return TriggerBuilder
                .newTrigger()
                .forJob(printJobDetail())
                .withSchedule(schedBuilder)
                .build();
    }
}
