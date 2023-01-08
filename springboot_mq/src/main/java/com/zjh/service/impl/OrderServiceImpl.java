package com.zjh.service.impl;

import com.zjh.service.MessageService;
import com.zjh.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName: OrderServiceImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/8  21:23
 * @Version: 1.0
 */

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private MessageService messageService;

    @Override
    public void order(String id) {
        //一些列操作，处理各种业务
        System.out.println("订单处理开始");
        //短信消息处理
        messageService.sendMessage(id);
        System.out.println("订单处理结束");
        System.out.println();
    }
}
