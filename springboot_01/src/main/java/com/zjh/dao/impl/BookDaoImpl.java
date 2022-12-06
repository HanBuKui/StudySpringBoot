package com.zjh.dao.impl;

import com.zjh.dao.BookDao;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: BookDaoImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/1  21:59
 * @Version: 1.0
 */

@Repository
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("Book save...");
    }
}
