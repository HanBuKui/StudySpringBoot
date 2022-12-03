package com.zjh.dao;

import com.zjh.entity.Product;
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
        System.out.println(productDao.selectList(null));
    }

    @Test
    public void testGetPage(){

    }

    @Test
    public void testGetBy(){

    }

}
