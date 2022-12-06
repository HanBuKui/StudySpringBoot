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
public interface ProductDao {
    @Select("select * from product where pid = #{id}")
    public Product getById(int id);
}

/*
##第二种方式：@MapperScan
    @MapperScan:找到Dao接口和Mapper文件
        basePackages:dao接口所在的包名


@SpringBootApplication
@MapperScan(basePackages = {"com.bjpowernode.dao","com.bjpowernode.mapper"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

 */


/*
#第三种方式：Mapper文件和dao接口分开管理
    把mapper文件放在resources目录下
        1.在resource目录中创建子目录，例如mapper
        2.把mapper文件放到mapper目录中
        3.在application.properties文件中，指定mapper文件位置
            #指定mapper文件的位置
            mybatis.mapper-locations=classpath:mapper/*.xml
            #添加mybatis日志
            mybatis.configuration.log-impl=org.apache.ibatis.logging.stdout.StdOutImpl
 */