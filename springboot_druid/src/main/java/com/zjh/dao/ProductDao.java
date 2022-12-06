package com.zjh.dao;

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

/*
##第一种方式：@Mapper
    @Mapper：放在dao接口上面，每个接口都需要使用这个注解
    告诉Mybatis这是dao接口。创建此接口的代理对象
 */

@Mapper   //为了被容器识别到，产生自动代理的对象  (在接口类上添加了@Mapper，在编译之后会生成相应的接口实现类)
@Repository
public interface ProductDao {
    @Select("select * from product where pid = #{id}")
    public Product getById(int id);
}
