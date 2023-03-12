package com.qing.owl.auth.infra.repository.user;

import org.springframework.stereotype.Repository;

import com.qing.owl.auth.infra.cache.RedisRepository;
import com.qing.owl.auth.user.PhoneNumber;
import com.qing.owl.auth.user.Sms;

import jakarta.annotation.Resource;

@Repository
public class SmsRepository {

    @Resource
    private RedisRepository redisRepository;

    public void save(Sms sms) {
        redisRepository.saveForExpireAt(sms.getPhoneNumber().getNumber(), sms.getText(), 20);
    }

    public Boolean isExist(PhoneNumber phoneNumber) {
        return redisRepository.hasKey(phoneNumber.getNumber());
    }

}
