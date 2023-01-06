package com.zjh.controller;

import com.zjh.domain.SMSCode;
import com.zjh.service.SMSCodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName: SMSCodeController
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/6  21:56
 * @Version: 1.0
 */

@RestController
@RequestMapping("/sms")
public class SMSCodeController {

    @Autowired
    private SMSCodeService smsCodeService;

    @GetMapping
    public String getCode(String tele){
        String code = smsCodeService.sendCodeToSMS(tele);
        return code;
    }

    @GetMapping("verify")
    public boolean checkCode(SMSCode smsCode){
        return smsCodeService.checkCode(smsCode);
    }

}
