package com.zjh.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @ClassName: DataSource
 * @Description: TODO
 * @author: zjh
 * @date: 2022/11/30  23:04
 * @Version: 1.0
 */

//1.定义数据模型封装yaml文件中对应的数据
@Data
//2.定义为spring管控的bean  否则无法进行属性注入
@Component
//3.指定加载的数据  此注解绑定封装信息到封装类中
@ConfigurationProperties("datasource")
public class DataSource {
    private String driver;
    private String url;
    private String username;
    private String password;

//    @Autowired   可有可无 User 可以//@ConfigurationProperties("datasource.user")  因为是这个一次性将所有都装入了
    private User user;
}
