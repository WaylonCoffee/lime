package com.qing.owl.auth.external;

import com.qing.owl.auth.account.PhoneNumber;
import com.qing.owl.auth.account.Sms;

public class SmsService {
    public Sms sendValidCode(PhoneNumber number) {
        // 调用外部服务发送短信验证码
        Sms sms = Sms.genRegisterCode(number);
        // TODO 外部发送短信服务
    }
}
