package com.qing.owl.auth.account.command;

import lombok.Data;

@Data
public class CreateUserCommand {
    private String name;
    private String phone;
    private String email;
    private String sex;
    private String password;
}
