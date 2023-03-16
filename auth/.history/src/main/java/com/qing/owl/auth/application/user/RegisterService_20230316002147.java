package com.qing.owl.auth.application.user;

import org.springframework.stereotype.Service;

import com.qing.owl.auth.domain.user.command.CreateUserCommand;
import com.qing.owl.auth.domain.user.command.QueryPhoneValidCodeCommand;
import com.qing.owl.auth.domain.user.model.PhoneNumber;
import com.qing.owl.auth.domain.user.model.Sms;
import com.qing.owl.auth.external.SmsService;
import com.qing.owl.auth.infra.repository.user.SmsRepository;

import jakarta.annotation.Resource;

@Service
public class RegisterService {

    @Resource
    private SmsService smsService;

    @Resource
    private SmsRepository smsRepository;

    /**
     * 发送短信验证码
     * 
     * @param command
     */
    public void sendValidCode(QueryPhoneValidCodeCommand command) {
        Phone phoneNumber = new Phone(command.getPhoneNumber());
        Boolean isSend = smsRepository.isExist(phoneNumber);

        if (isSend) {
            throw new IllegalArgumentException("验证码获取频繁，请稍后再试！");
        }
        Sms sms = smsService.sendValidCode(phoneNumber);
        smsRepository.save(sms);
    }

    public void register(CreateUserCommand command) {

    }
}
