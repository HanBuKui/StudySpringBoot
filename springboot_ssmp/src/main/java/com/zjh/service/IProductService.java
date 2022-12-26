package com.zjh.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zjh.entity.Product;

import java.util.List;

/**
 * @ClassName: IProductService
 * @Description: 基于MP构建
 * @author: zjh
 * @date: 2022/12/6  22:06
 * @Version: 1.0
 */


public interface IProductService extends IService<Product> {

    public IPage<Product> getPage(int page, int size);

}