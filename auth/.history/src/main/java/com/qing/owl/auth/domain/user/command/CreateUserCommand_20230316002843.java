package com.qing.owl.auth.domain.user.command;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
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
