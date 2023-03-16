package com.qing.owl.auth.domain.user.command;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class QueryPhoneValidCodeCommand {
    @NotNull
    private String phoneNumber;
}
