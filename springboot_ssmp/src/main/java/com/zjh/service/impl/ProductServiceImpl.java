package com.zjh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zjh.dao.ProductDao;
import com.zjh.entity.Product;
import com.zjh.service.IProductService;
import org.springframework.stereotype.Service;

/**
 * @ClassName: ProductServiceImpl
 * @Description: MP版本
 * @author: zjh
 * @date: 2022/12/6  22:09
 * @Version: 1.0
 */

@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements IProductService {

}
