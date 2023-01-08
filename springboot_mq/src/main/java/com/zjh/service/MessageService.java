package com.zjh.service;

/**
 * @ClassName: MessageService
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/8  21:31
 * @Version: 1.0
 */

public interface MessageService {
    /**
    *@Description: 将消息放到消息队列中
    *@Param: [id]
    *@return: void
    */
    void sendMessage(String id);

    /**
    *@Description: 从消息队列中取出消息，真正执行发送短信功能
    *@Param: []
    *@return: void
    */
    String doMessage();
}
