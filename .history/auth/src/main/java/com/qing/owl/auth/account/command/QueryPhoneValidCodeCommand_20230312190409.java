package com.qing.owl.auth.account.command;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class QueryPhoneValidCodeCommand {
    @NotNull
    private String phoneNumber;
}
