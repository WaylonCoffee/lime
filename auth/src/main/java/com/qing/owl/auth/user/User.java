package com.qing.owl.auth.user;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String code;
    private String name;
    private String phone;
    private String password;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String sex;
    private String source;

    public User() {

    }

}
