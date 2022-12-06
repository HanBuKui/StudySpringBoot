package com.zjh;

import com.zjh.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springboot01ApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.save();
    }

}
