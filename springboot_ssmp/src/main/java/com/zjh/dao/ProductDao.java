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
/*
添加了@Mapper注解之后这个接口在编译时会生成相应的实现类
 * 需要注意的是：这个接口中不可以定义同名的方法，因为会生成相同的id
 * 也就是说这个接口是不支持重载的
 */

@Mapper
@Repository
public interface ProductDao extends BaseMapper<Product> {
}
