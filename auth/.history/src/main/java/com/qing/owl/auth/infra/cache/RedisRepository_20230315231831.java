package com.qing.owl.auth.infra.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import jakarta.annotation.Resource;

@Component
public class RedisRepository {

    @Resource
    private RedisTemplate<String, String> redisTemplate;

    public void save(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void saveForExpireAt(String key, String value, long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
    }

    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    public String get(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public String getAtomicNum(String key) {
        return redisTemplate.opsForValue().get(key);
    }

}
