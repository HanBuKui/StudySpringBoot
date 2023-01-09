package com.zjh.service.impl.rocketmq;

import com.zjh.service.MessageService;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: MessageServiceRocketmqImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/10  0:21
 * @Version: 1.0
 */

@Service
public class MessageServiceRocketmqImpl implements MessageService {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @Override
    public void sendMessage(String id) {
        System.out.println("待发送短信的订单已进入处理队列(rocketmq)，id="+id);
//        rocketMQTemplate.convertAndSend("order_id",id);  //同步发送
        SendCallback callback = new SendCallback() {   //异步执行，是在send操作完之后做的
            @Override
            public void onSuccess(SendResult sendResult) {
                System.out.println("消息发送成功");
            }

            @Override
            public void onException(Throwable throwable) {
                System.out.println("消息发送失败！！！！！！");
            }
        };
        rocketMQTemplate.asyncSend("order_id",id,callback); //异步发送消息  操作rocketMQ常见的行为

    }

    @Override
    public String doMessage() {
        return null;
    }
}
