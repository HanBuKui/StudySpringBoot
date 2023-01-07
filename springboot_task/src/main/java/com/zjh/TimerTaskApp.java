package com.zjh;

import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName: TimerTaskApp
 * @Description: java原生的定时任务
 * @author: zjh
 * @date: 2023/1/7  23:28
 * @Version: 1.0
 */
public class TimerTaskApp {

    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.println("timer task run...");
            }
        };

        timer.schedule(task,0,2000);
    }
}
