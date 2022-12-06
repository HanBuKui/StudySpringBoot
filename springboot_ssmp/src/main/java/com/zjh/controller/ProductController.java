package com.zjh.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjh.entity.Product;
import com.zjh.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;

/**
 * @ClassName: ProductController
 * @Description: 表现层标准开发（RestFull）
 * @author: zjh
 * @date: 2022/12/6  22:51
 * @Version: 1.0
 */

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private IProductService service;

    @GetMapping
    public List<Product> getAll(){
        return service.list();
    }

    @PostMapping
    public boolean save(@RequestBody Product product){
        return service.save(product);
    }

    @PutMapping
    public boolean update(@RequestBody Product product){
        return service.updateById(product);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") Integer id){
        return service.removeById(id);
    }

    @GetMapping("/{id}")
    public Product getById(@PathVariable("id") Integer id){
        return service.getById(id);
    }

    @GetMapping("/{curPage}/{size}")
    public IPage<Product> getPage(@PathVariable int curPage, @PathVariable int size){
        return service.getPage(curPage,size);
    }

}
