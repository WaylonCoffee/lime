package com.qing.owl.auth.domain.user.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class UserCodeGenerator {

    private final static String USER_CODE_PREFIX = "UC";

    public String generate() {
        
        return USER_CODE_PREFIX + LocalDate.now()
    }
}
