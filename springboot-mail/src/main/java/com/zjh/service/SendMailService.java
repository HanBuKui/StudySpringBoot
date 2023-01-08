package com.zjh.service;

import javax.mail.MessagingException;

/**
 * @ClassName: SendMailService
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/8  15:11
 * @Version: 1.0
 */
public interface SendMailService {
    public void sendSimpleMail(); // 发送简单邮件


    /**
     多用途因特网邮件扩展协议（Multipurpose Internet Mail Extensions，MIME）
     除了传输文本信息，还可以发送语音、图像和视频等信息
    */
    public void sendMimeMail() throws MessagingException;

}
