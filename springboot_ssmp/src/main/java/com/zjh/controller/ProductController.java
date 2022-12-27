package com.zjh.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zjh.controller.utils.Result;
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
    public Result getAll(){
        return new Result(true,service.list());
    }

    @PostMapping
    public Result save(@RequestBody Product product){
        Result result = new Result(service.save(product));
        return result;
    }

    @PutMapping
    public Result update(@RequestBody Product product){
        return new Result(service.updateById(product));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable("id") Integer id){
        return new Result(service.removeById(id));
    }

    @GetMapping("/{id}")
    public Result getById(@PathVariable("id") Integer id){
        return new Result(true,service.getById(id));
    }

    @GetMapping("/{curPage}/{size}")
    public Result getPage(@PathVariable int curPage, @PathVariable int size){
        IPage<Product> page = service.getPage(curPage, size);
        //如果当前页码值大于总页码值，那么重新查询，使用最大页码值作为当前页码值
        if(page.getCurrent() > page.getPages()){
            page = service.getPage((int)page.getPages(), size);
        }
        return new Result(true, page);
    }


}
