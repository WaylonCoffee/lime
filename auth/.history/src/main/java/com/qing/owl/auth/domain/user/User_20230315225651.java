package com.qing.owl.auth.domain.user;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    private String code;
    private String name;
    private PhoneNumber phone;
    private String password;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String sex;
    private String source;

    public User(String code, String name, PhoneNumber phone, String password) {

    }

}
