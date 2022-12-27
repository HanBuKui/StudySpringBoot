package com.zjh.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjh.controller.utils.Result;
import com.zjh.dao.ProductDao;
import com.zjh.entity.Product;
import com.zjh.service.IProductService;
import org.apache.logging.log4j.util.Strings;
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

    @Override
    public IPage<Product> getPage(int page, int size, String name, String desc, String price) {
        LambdaQueryWrapper<Product> lqw = new LambdaQueryWrapper<>();
        lqw.like(Strings.isNotEmpty(name), Product::getPname, name);
        lqw.le(Strings.isNotEmpty(price),Product::getPprice,price);
        /*
        and一定要加这个condition
        因为and语句是往后面加括号，如果不加在没有条件，会直接加上（），但里面填充的语句因不符合条件所以为空，则查找时sql语句为：SELECT * FROM product WHERE ()  会导致sql报错
        所以加上条件，在有查询数据时使用and 即后面的括号
         */
        lqw.and(Strings.isNotEmpty(desc),qw ->
            qw.like(Strings.isNotEmpty(desc),Product::getPdec1,desc)
                .or().like(Strings.isNotEmpty(desc),Product::getPdec2, desc)
                .or().like(Strings.isNotEmpty(desc),Product::getPdec3, desc)
        );
        IPage page1 = new Page(page,size);
        dao.selectPage(page1,lqw);

        return page1;
    }
}
