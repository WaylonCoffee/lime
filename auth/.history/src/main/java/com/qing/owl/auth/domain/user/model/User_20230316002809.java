package com.qing.owl.auth.domain.user.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    private String code;
    private String name;
    private Phone phone;
    private Password password;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String sex;
    private String source;

    public User(String code, String name, Phone phone, Password password, String sex) {
        this.code = code;
        this.name = name;
        this.phone = phone;
        this.password = password;
        this.sex = sex;
    }

}
