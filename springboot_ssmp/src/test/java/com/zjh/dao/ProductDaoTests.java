package com.zjh.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjh.entity.Product;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: ProductDaoTests
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/4  0:27
 * @Version: 1.0
 */

@SpringBootTest
public class ProductDaoTests {

    @Autowired
    private ProductDao productDao;

    @Test
    public void getById(){
        System.out.println(productDao.selectById(2));
    }

    @Test
    public void testSave(){
        Product product = new Product();
        product.setPdec1("dec1");
        product.setPdec2("dec2");
        product.setPdec3("dec3");

        product.setPimg1("img1");
        product.setPimg2("img2");
        product.setPimg3("img3");

        product.setPprice(16.72);
        product.setPname("测试数据1");

        productDao.insert(product);
    }

    @Test
    public void testUpdate(){
        Product product = new Product();
        product.setPdec1("dec1aa");
        product.setPdec2("dec2aa");
        product.setPdec3("dec3aa");

        product.setPimg1("img1aa");
        product.setPimg2("img2aa");
        product.setPimg3("img3aa");

        product.setPprice(16.72);
        product.setPname("测试数据1toUpdate");
        product.setPid(8);

        productDao.updateById(product);
    }

    @Test
    public void testDelete(){
        productDao.deleteById(7);
    }

    @Test
    public void testGetAll(){
        productDao.selectList(null);
    }

    @Test
    public void testGetPage(){
        //分页
        //要在配置类中加拦截器使分页生效
        Page<Product> productPage = productDao.selectPage(new Page<>(2, 3), null);
        System.out.println(productPage.getCurrent());  //第几页
        System.out.println(productPage.getPages());   //一共几页
        System.out.println(productPage.getSize());    //每页大小
        System.out.println(productPage.getTotal());   //数据库中的总数据
        System.out.println(productPage.getRecords());  //本页的记录

    }

    @Test
    public void testGetBy(){  //按条件查询

        QueryWrapper<Product> qw = new QueryWrapper<>();
        qw.like("pname","白夜行");   //所有查询操作封装成方法调用  查询条件支持动态条件拼装
        productDao.selectList(qw);
    }

    @Test
    public void testGetBy2(){
        String name = "";
        LambdaQueryWrapper<Product> lqw = new LambdaQueryWrapper<>();  //推荐
//        if(name!=null) lqw.like(Product::getPname,name);
        lqw.like(name!=null && Strings.isNotEmpty(name),Product::getPname,name); //condition为true，则连接
        productDao.selectList(lqw);
    }

}
