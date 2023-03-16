package com.qing.owl.auth.external;

import org.springframework.stereotype.Service;

import com.qing.owl.auth.domain.user.model.PhoneNumber;
import com.qing.owl.auth.domain.user.model.Sms;

@Service
public class SmsService {
    public Sms sendValidCode(Phone number) {
        // 调用外部服务发送短信验证码
        Sms sms = Sms.genRegisterCode(number);
        // TODO 外部发送短信服务
        return sms;
    }
}
