package com.qing.owl.auth.domain.user.model;

import java.time.Instant;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class IdGeneratorService {

    private final static String USER_CODE_PREFIX = "UC";

    private String 

    public String generate() {
        
        return USER_CODE_PREFIX + Instant.now() + 
    }
}
