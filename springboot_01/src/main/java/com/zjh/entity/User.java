package com.zjh.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


/**
 * @ClassName: user
 * @Description: TODO
 * @author: zjh
 * @date: 2022/11/30  23:16
 * @Version: 1.0
 */

@Data
@Component
@ConfigurationProperties("datasource.user")
public class User {
    private String name;
    private int age;
}
