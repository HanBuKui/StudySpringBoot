package com.zjh.controller;

import com.zjh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: MessageController
 * @Description: 具体处理消息队列中的操作
 * @author: zjh
 * @date: 2023/1/8  21:49
 * @Version: 1.0
 */

@RestController
@RequestMapping("/msgs")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public String doMessage(){
        String id = messageService.doMessage();
        return id;
    }

}
