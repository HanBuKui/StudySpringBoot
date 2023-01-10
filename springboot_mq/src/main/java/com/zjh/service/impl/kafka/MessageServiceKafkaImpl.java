package com.zjh.service.impl.kafka;

import com.zjh.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName: MessageServiceKafkaImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/10  20:19
 * @Version: 1.0
 */

@Service
public class MessageServiceKafkaImpl implements MessageService {

    @Resource
    private KafkaTemplate<String,String> kafkaTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已进入处理队列(kafka)，id="+id);
        kafkaTemplate.send("zjh_test",id);
    }

    @Override
    public String doMessage() {
        return null;
    }
}
