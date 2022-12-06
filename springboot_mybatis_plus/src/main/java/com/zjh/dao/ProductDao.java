package com.zjh.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zjh.domain.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @ClassName: ProductDao
 * @Description: TODO
 * @author: zjh
 * @date: 2022/12/1  22:32
 * @Version: 1.0
 */

@Mapper
@Repository
public interface ProductDao extends BaseMapper<Product> {
//    @Select("select * from product where pid = #{id}")
//    public Product getById(int id);
}
