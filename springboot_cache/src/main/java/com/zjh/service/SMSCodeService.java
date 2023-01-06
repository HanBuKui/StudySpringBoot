package com.zjh.service;

import com.zjh.domain.SMSCode;

/**
 * @ClassName: SMSCodeService
 * @Description: TODO
 * @author: zjh
 * @date: 2023/1/6  21:56
 * @Version: 1.0
 */


public interface SMSCodeService {
    public String sendCodeToSMS(String tele);

    public boolean checkCode(SMSCode smsCode);
}
