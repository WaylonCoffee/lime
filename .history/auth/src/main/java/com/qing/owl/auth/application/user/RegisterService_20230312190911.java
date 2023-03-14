package com.qing.owl.auth.application.user;

import org.springframework.stereotype.Service;

import com.qing.owl.auth.account.PhoneNumber;
import com.qing.owl.auth.account.Sms;
import com.qing.owl.auth.account.command.QueryPhoneValidCodeCommand;
import com.qing.owl.auth.external.SmsService;

import jakarta.annotation.Resource;

@Service
public class RegisterService {

    @Resource
    private SmsService smsService;

    public void sendValidCode(QueryPhoneValidCodeCommand command) {
        Sms sms = smsService.sendValidCode(new PhoneNumber(command.getPhoneNumber()));
    }
}
