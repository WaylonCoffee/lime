package com.qing.owl.auth.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.qing.owl.auth.application.user.RegisterService;
import com.qing.owl.auth.domain.user.command.CreateUserCommand;
import com.qing.owl.auth.domain.user.command.QueryPhoneValidCodeCommand;

import jakarta.annotation.Resource;

@SpringBootTest
public class RegisterServiceTest {

    @Resource
    RegisterService registerService;

    @Resource
    com.qing.owl.auth.domain.user.model.IdGeneratorService IdGeneratorService;

    @Test
    public void testSendValidCode() {
        QueryPhoneValidCodeCommand command = QueryPhoneValidCodeCommand.builder().phoneNumber("18000000001").build();
        registerService.sendValidCode(command);
    }

    @Test
    public void testCreateUser() {
        CreateUserCommand command = CreateUserCommand.builder().name("小明").phone("18000000001").password("Peng@3270*")
                .sex("male").build();
        registerService.register(command);
    }
}
