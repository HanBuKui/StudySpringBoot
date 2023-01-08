package com.zjh.service.impl;

import com.zjh.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;
import java.io.FileInputStream;

/**
 * @ClassName: SendMailServiceImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/8  15:11
 * @Version: 1.0
 */

@Service

public class SendMailServiceImpl implements SendMailService {

//    private String from = "xx@qq.com(吃饼干的coder)";   //发送人
    @Value("${spring.mail.username}")
    private String from;
    private String to = "xx@qq.com";  //接收人
    private String subject = "测试邮件";  //邮件主题
    private String text = "simple测试邮件正文";  //邮件内容
    private String minetext = "<a href='https://www.baidu.com'>点开有惊喜</a>";  //邮件内容

    @Resource
    private JavaMailSender javaMailSender;

    @Override
    public void sendSimpleMail() {
        SimpleMailMessage mailMessage = new SimpleMailMessage();   //简单邮件的发送
        mailMessage.setFrom(from);
        mailMessage.setTo(to);
        mailMessage.setSubject(subject);
        mailMessage.setText(text);
        javaMailSender.send(mailMessage);
    }

    @Override
    public void sendMimeMail() throws MessagingException {
        //复杂邮件
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage,true,"UTF-8");  //true：多部件（可以添加附件）
        helper.setFrom(from);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(minetext,true);  //可解析html

        //添加附件
        File file1 = new File("src\\main\\java\\com\\zjh\\service\\impl\\SendMailServiceImpl.java");
        helper.addAttachment(file1.getName(),file1);

        javaMailSender.send(mimeMessage);
    }
}
