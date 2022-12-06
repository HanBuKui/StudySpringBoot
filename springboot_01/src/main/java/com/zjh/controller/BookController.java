package com.zjh.controller;

import com.zjh.entity.DataSource;
import com.zjh.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: BookController
 * @Description: TODO
 * @author: zjh
 * @date: 2022/11/28  22:08
 * @Version: 1.0
 */

@RestController
@RequestMapping("/book")
public class BookController {

    @Value("${server.port}")
    private String port;

    //使用自动装配（byType）将所有的数据封装到一个对象
    @Autowired
    private Environment env;

    //boot读取yaml配置信息
    @Autowired
    private DataSource dataSource;

    @Autowired
    private User user;

    @GetMapping("/{id}/{name}")
    public String getById(@PathVariable("id") int id,@PathVariable("name") String name){
        System.out.println("springboot is running..."+port);
        System.out.println(dataSource);
        System.out.println(user);
        return "springboot is running=>"+id+":"+name+"  "+env.getProperty("server.port");
    }
}
