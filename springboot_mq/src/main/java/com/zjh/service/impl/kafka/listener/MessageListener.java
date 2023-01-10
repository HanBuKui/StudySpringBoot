package com.zjh.service.impl.kafka.listener;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MessageListener
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/10  20:28
 * @Version: 1.0
 */

@Component
public class MessageListener {
    
    @KafkaListener(topics = "zjh_test")
    public void receive(ConsumerRecord<String,String> record){
        System.out.println("Listener -> 已完成短信发送业务(kafka),id="+record.value());
    }

}
