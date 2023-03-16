package com.qing.owl.auth.domain.user.model;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.qing.owl.auth.infra.cache.RedisRepository;

import jakarta.annotation.Resource;

@Component
public class IdGeneratorService {

    private final static String USER_CODE_PREFIX = "UC";
    private final static String USER_CODE_ATOMIC_KEY = "USER_CODE_ATOMIC_KEY";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    @Resource
    private RedisRepository redisRepository;

    public String generate() {
        redisRepository.getAndIncrement(USER_CODE_ATOMIC_KEY, LocalDate.);
        return USER_CODE_PREFIX + Instant.now() + redisRepository.get("USER_CODE_ATOMIC_KEY");
    }

    private Date getTodayEndTime() {
        LocalDate nowDate = LocalDate.now();
        LocalDateTime endTime = LocalDateTime.of(nowDate, LocalTime.MAX);
        return Date.from(endTime.atZone(ZoneOffset.ofHours(8)).toInstant());
    }
}
