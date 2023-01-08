package com.zjh.service.impl.activemq.listener;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MessageListener
 * @Description: MQ的监听器
 * @author: zjh
 * @date: 2023/1/8  22:51
 * @Version: 1.0
 */

@Component  //让Spring管控
public class MessageListener {

    @JmsListener(destination = "order.queue.id")   //监听器
    @SendTo("order.queue.other.id")  //消费完后可以将消息转发(是当前方法的返回值)
    //可以对"order.queue.other.id"再做一个监听，流水线
    public String receive(String id){
        System.out.println("Listener -> 已完成短信发送业务,id="+id);
        return "new:"+id;
    }

}
