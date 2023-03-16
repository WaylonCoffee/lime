package com.qing.owl.auth.domain.user.command;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateUserCommand {
    @NotNull
    private String name;
    @NotNull
    private String phone;
    @NotNull
    private String sex;
    @NotNull
    private String password;
}
