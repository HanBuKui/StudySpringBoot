package com.zjh.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: SMSCode
 * @Description: 验证码实体类
 * @author: zjh
 * @date: 2023/1/6  21:57
 * @Version: 1.0
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SMSCode {
    private String tele;
    private String code;
}
