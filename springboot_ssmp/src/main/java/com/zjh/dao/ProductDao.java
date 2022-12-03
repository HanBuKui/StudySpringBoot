package com.zjh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjh.entity.Product;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @IntergaceName: ProductDao
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/4  0:14
 * @Version: 1.0
 */

@Mapper
@Repository
public interface ProductDao extends BaseMapper<Product> {
}
