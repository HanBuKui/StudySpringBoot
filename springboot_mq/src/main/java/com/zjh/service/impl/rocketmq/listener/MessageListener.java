package com.zjh.service.impl.rocketmq.listener;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;

/**
 * @ClassName: MessageListener
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/10  0:45
 * @Version: 1.0
 */

//@Component
@RocketMQMessageListener(consumerGroup = "group_rocketmq", topic = "order_id")
public class MessageListener implements RocketMQListener<String> {

    @Override
    public void onMessage(String id) {
        System.out.println("Listener -> 已完成短信发送业务(rocketmq),id="+id);
    }
}
