package com.qing.owl.auth.application.user;

import org.springframework.stereotype.Service;

import com.qing.owl.auth.account.PhoneNumber;
import com.qing.owl.auth.account.Sms;
import com.qing.owl.auth.account.command.QueryPhoneValidCodeCommand;
import com.qing.owl.auth.external.SmsService;
import com.qing.owl.auth.infra.cache.RedisRepository;

import jakarta.annotation.Resource;

@Service
public class RegisterService {

    @Resource
    private SmsService smsService;

    @Resource
    private RedisRepository redisRepository;

    public void sendValidCode(QueryPhoneValidCodeCommand command) {

        if()

        Sms sms = smsService.sendValidCode(new PhoneNumber(command.getPhoneNumber()));
        
    }
}
