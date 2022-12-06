package com.zjh.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjh.dao.ProductDao;
import com.zjh.entity.Product;
import com.zjh.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: ProductServiceImpl
 * @Description: MP版本
 * @author: zjh
 * @date: 2022/12/6  22:09
 * @Version: 1.0
 */

@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements IProductService {

    @Autowired
    private ProductDao dao;

    @Override
    public IPage<Product> getPage(int page, int size) {
        IPage page1 = new Page(page,size);
        dao.selectPage(page1,null);

        return page1;
    }
}
