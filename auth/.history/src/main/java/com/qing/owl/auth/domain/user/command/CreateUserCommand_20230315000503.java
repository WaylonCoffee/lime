package com.qing.owl.auth.domain.user.command;

import lombok.Data;

@Data
public class CreateUserCommand {
    private String name;
    private String phone;
    private String sex;
    private String password;
}
