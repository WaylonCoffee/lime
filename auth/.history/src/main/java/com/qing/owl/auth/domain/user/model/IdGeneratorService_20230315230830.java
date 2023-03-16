package com.qing.owl.auth.domain.user.model;

import java.time.Instant;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import com.qing.owl.auth.infra.cache.RedisRepository;

@Component
public class IdGeneratorService {

    private final static String USER_CODE_PREFIX = "UC";

    private RedisRepository redisRepository

    public String generate() {
        
        return USER_CODE_PREFIX + Instant.now() + 
    }
}
