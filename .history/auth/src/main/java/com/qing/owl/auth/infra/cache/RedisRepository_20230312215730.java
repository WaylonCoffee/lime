package com.qing.owl.auth.infra.cache;

import java.util.concurrent.TimeUnit;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import jakarta.annotation.Resource;

@Repository
public class RedisRepository {

    @Resource
    private RedisTemplate<String, Object> redisTemplate;

    public void save(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    public void saveForExpireAt(String key, String value, long timeout) {
        redisTemplate.opsForValue().set(key, value, timeout, TimeUnit.SECONDS);
    }

    public Boolean hasKey(String key) {
        redisTemplate.opsForValue().get(key);
        return false;
    }

}
