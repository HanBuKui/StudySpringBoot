package com.zjh.utils;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;

/**
 * @ClassName: CodeUtils
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/6  22:00
 * @Version: 1.0
 */

@Component
public class CodeUtils {

    private String[] fillZero = new String[]{"000000","00000","0000","000","00","0",""};

    /**
    *@Description: 生成验证码
    *@Param: [tele:手机号]
    *@return: java.lang.String
    */
    public String generateCode(String tele){
        int hash = tele.hashCode();
        int encryption = 20230106; //加密码
        long result = hash ^ encryption;
        long time = System.currentTimeMillis();
        result ^= time;
        long code = result % 1000000;
        code = code < 0 ? -code : code;
        String codeStr = code+"";
        return fillZero[codeStr.length()]+codeStr;
    }

    @Cacheable(value = "smsCode",key = "#tele")   //注解想生效，必须走bean的spring处理模式！！坑
    public String getCode(String tele){        //如果放在service中，就变成了this调用，不走spring容器，只是简单的方法调用
        return null;
    }
}
