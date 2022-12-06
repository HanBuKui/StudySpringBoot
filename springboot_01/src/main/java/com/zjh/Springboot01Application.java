package com.zjh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Springboot01Application {

    /*
    引导类
        初始化Spring容器，扫描引导类所在包及其子包加载bean===>所有的一切都是spring
     */
    public static void main(String[] args) {
        SpringApplication.run(Springboot01Application.class, args);
    }

}
