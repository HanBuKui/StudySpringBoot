package com.zjh.service.impl;

import com.zjh.domain.SMSCode;
import com.zjh.service.SMSCodeService;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.stereotype.Service;
import com.zjh.utils.CodeUtils;

/**
 * @ClassName: SMSCodeServiceImpl
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/6  21:56
 * @Version: 1.0
 */

@Service
public class SMSCodeServiceImpl implements SMSCodeService {

    @Autowired
    private CodeUtils codeUtils;

    @Override
    @CachePut(value = "smsCode",key = "#tele")   //缓存中只放不取
    public String sendCodeToSMS(String tele) {
        return codeUtils.generateCode(tele);
    }

    @Override
    public boolean checkCode(SMSCode smsCode) {
        String code = smsCode.getCode();
        if(Strings.isBlank(code)) return false;
        return code.equals(codeUtils.getCode(smsCode.getTele()));
    }
}
