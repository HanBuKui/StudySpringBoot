package com.zjh.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjh.dao.ProductDao;
import com.zjh.entity.Product;
import com.zjh.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ProduceServiceImpl
 * @Description: 基础CRUD版本
 * @author: zjh
 * @date: 2022/12/6  21:48
 * @Version: 1.0
 */

@Service
public class ProduceServiceImpl2 implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Boolean save(Product product) {
        return productDao.insert(product) > 0;
    }

    @Override
    public Boolean update(Product product) {
        return productDao.updateById(product) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return productDao.deleteById(id) > 0;
    }

    @Override
    public Product getById(Integer id) {
        return productDao.selectById(id);
    }

    @Override
    public List<Product> getAll() {
        return productDao.selectList(null);
    }

    @Override
    public IPage<Product> getPage(int curPage, int pageSize) {
        IPage<Product> page = new Page<>(curPage,pageSize);
        productDao.selectPage(page,null);
        return page;
    }
}
