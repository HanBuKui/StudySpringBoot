package com.zjh.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zjh.entity.Product;
import org.apache.logging.log4j.util.Strings;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @ClassName: ProductServiceTest
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/6  21:54
 * @Version: 1.0
 */

@SpringBootTest
public class ProductServiceTest {
    @Autowired
    private IProductService productService;

    @Test
    void testGetById(){
        System.out.println(productService.getById(3));
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
        product.setPname("测试数据lalala");

        productService.save(product);
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
        product.setPname("-----------");
        product.setPid(8);

        productService.updateById(product);
    }

    @Test
    public void testDelete(){
        productService.removeById(16);
    }

    @Test
    public void testGetAll(){
        productService.list();
    }

    @Test
    public void testGetPage(){
        //分页
        //要在配置类中加拦截器使分页生效
        IPage<Product> page = new Page<>(2,3);
        productService.page(page);
        System.out.println(page.getRecords());  //分页查到的数据
        System.out.println(page.getCurrent());  //当前是第几页
        System.out.println(page.getPages());    //一共有多少页
        System.out.println(page.getSize());     //每页大小
        System.out.println(page.getTotal());    //数据总数
//        System.out.println(page.getRecords());
    }

}
