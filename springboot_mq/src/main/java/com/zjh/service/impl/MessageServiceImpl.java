package com.zjh.service.impl;

import com.zjh.service.MessageService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @ClassName: MessageServiceImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/8  21:33
 * @Version: 1.0
 */

@Service
public class MessageServiceImpl implements MessageService {

    private ArrayList<String> msgList = new ArrayList<>();

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已进入处理队列，id="+id);
        msgList.add(id);
    }

    @Override
    public String doMessage() {
        String id = msgList.remove(0);
        System.out.println("已完成短信发送业务,id="+id);
        return id;
    }
}
