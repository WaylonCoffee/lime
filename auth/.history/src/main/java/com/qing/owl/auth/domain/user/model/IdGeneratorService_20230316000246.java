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
    private final static DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    @Resource
    private RedisRepository redisRepository;

    public String generate() {
        Long num = redisRepository.getAndIncrement(USER_CODE_ATOMIC_KEY, getTodayEndTime());
        if (num > 6) {
            throw new IllegalArgumentException("id 长度溢出");
        }
        return USER_CODE_PREFIX + LocalDate.now().format(DATE_FORMATTER) + String.format("%1$06d", num);
    }

    private Date getTodayEndTime() {
        LocalDate nowDate = LocalDate.now();
        LocalDateTime endTime = LocalDateTime.of(nowDate, LocalTime.MAX);
        return Date.from(endTime.atZone(ZoneOffset.ofHours(8)).toInstant());
    }
}
