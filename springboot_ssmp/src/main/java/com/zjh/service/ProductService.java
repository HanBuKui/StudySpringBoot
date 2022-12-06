package com.zjh.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjh.entity.Product;

import java.util.List;

/**
 * @ClassName: ProductService
 * @Description: 基础CRUD版本
 * @author: zjh
 * @date: 2022/12/6  21:46
 * @Version: 1.0
 */


public interface ProductService {

    Boolean save(Product product);

    Boolean update(Product product);

    Boolean delete(Integer id);

    Product getById(Integer id);

    List<Product> getAll();

    IPage<Product> getPage(int curPage,int pageSize);
}
