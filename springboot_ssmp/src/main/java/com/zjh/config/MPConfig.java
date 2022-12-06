package com.zjh.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName: MPConfig
 * @Description:  MP拦截器
 * @author: zjh
 * @date: 2022/12/4  22:31
 * @Version: 1.0
 */


//MP的拦截器  配置类

@Configuration
public class MPConfig {
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        /*
        分页操作是在MP常规操作基础上增强得到的，内部是动态的拼写sql语句，因此需要增强对应的功能，使用MP拦截器实现
         */

        /*
        具体的拦截器
            1.分页的拦截器 在执行分页操作时能在sql语句末尾加上limit new PaginationInnerInterceptor()
         */
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }

}
