package com.qing.owl.auth.user;

import java.time.LocalDateTime;

public class User {
    private Long id;
    private String code;
    private String name;
    private String phone;
    private String password;
    private String salt;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String email;
    private String sex;
    private String source;
}
