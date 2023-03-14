package com.qing.owl.auth.application.user;

import org.springframework.stereotype.Service;

import com.qing.owl.auth.account.PhoneNumber;
import com.qing.owl.auth.account.Sms;
import com.qing.owl.auth.account.command.QueryPhoneValidCodeCommand;
import com.qing.owl.auth.external.SmsService;
import com.qing.owl.auth.infra.repository.user.SmsRepository;

import jakarta.annotation.Resource;

@Service
public class RegisterService {

    @Resource
    private SmsService smsService;

    @Resource
    private SmsRepository smsRepository;

    public void sendValidCode(QueryPhoneValidCodeCommand command) {
        PhoneNumber phoneNumber = new PhoneNumber(command.getPhoneNumber());
        Boolean isSend = smsRepository.hasKey(phoneNumber.getNumber());
        if (isSend) {
            throw new IllegalArgumentException("验证码获取频繁，请稍后再试！");
        }
        Sms sms = smsService.sendValidCode(phoneNumber);
        redisRepository.save(sms.get, null);
    }
}
