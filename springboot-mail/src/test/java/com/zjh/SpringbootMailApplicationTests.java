package com.zjh;

import com.zjh.service.SendMailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.mail.MessagingException;

@SpringBootTest
class SpringbootMailApplicationTests {

	@Autowired
	private SendMailService mailService;

	@Test
	void testSimpleMail(){
		mailService.sendSimpleMail();
	}

	@Test
	void testMineMail() throws MessagingException {
		mailService.sendMimeMail();
	}
}
