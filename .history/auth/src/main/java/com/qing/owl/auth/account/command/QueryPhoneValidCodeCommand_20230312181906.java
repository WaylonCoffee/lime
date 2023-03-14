package com.qing.owl.auth.account.command;

import lombok.Data;

@Data
public class QueryPhoneValidCodeCommand {
    @Notnull
    private String phone;
}
