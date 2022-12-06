package com.zjh;

import com.zjh.dao.ProductDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootDruidApplicationTests {

	@Autowired
	private ProductDao productDao;


	@Test
	void contextLoads() {
		System.out.println(productDao.getById(2));
	}

}
