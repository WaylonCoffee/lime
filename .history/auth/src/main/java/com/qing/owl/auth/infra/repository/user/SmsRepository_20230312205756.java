package com.qing.owl.auth.infra.repository.user;

import org.springframework.stereotype.Repository;

import com.qing.owl.auth.account.PhoneNumber;
import com.qing.owl.auth.account.Sms;
import com.qing.owl.auth.infra.cache.RedisRepository;

import jakarta.annotation.Resource;

@Repository
public class SmsRepository {

    @Resource
    private RedisRepository redisRepository;

    public void save(Sms sms) {
        redisRepository.save(sms.getPhoneNumber().getNumber(), sms.getText());
    }

    public Boolean isExist(PhoneNumber phoneNumber) {
        redisRepository.save(sms.getPhoneNumber().getNumber(), sms.getText());
    }

}
