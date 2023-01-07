package com.zjh.quartz;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @ClassName: MyQuartz
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/7  23:50
 * @Version: 1.0
 */

public class MyQuartz extends QuartzJobBean {
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        System.out.println("quartz task run...");
    }
}
