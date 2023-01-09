package com.zjh.service.impl.activemq;

import com.zjh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @ClassName: MessageServiceActivemqImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/8  22:29
 * @Version: 1.0
 */

//@Service
public class MessageServiceActivemqImpl implements MessageService {

    @Autowired
    private JmsMessagingTemplate messagingTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已进入处理队列(activemq)，id="+id);
        messagingTemplate.convertAndSend("order.queue.id",id);  //目的地(保存位置)
    }

    @Override
    public String doMessage() {
        String id = messagingTemplate.receiveAndConvert("order.queue.id",String.class);
        System.out.println("已完成短信发送业务,id="+id);
        return id;
    }
}
