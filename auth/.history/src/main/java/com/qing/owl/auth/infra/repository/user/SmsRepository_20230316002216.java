package com.qing.owl.auth.infra.repository.user;

import org.springframework.stereotype.Repository;

import com.qing.owl.auth.domain.user.model.Phone;
import com.qing.owl.auth.domain.user.model.Sms;
import com.qing.owl.auth.infra.cache.RedisRepository;

import jakarta.annotation.Resource;

@Repository
public class SmsRepository {

    @Resource
    private RedisRepository redisRepository;

    public void save(Sms sms) {
        redisRepository.saveForExpireAt(sms.getPhoneNumber().getNumber(), sms.getText(), 20);
    }

    public Boolean isExist(Phone phoneNumber) {
        return redisRepository.hasKey(phoneNumber.getNumber());
    }

}
