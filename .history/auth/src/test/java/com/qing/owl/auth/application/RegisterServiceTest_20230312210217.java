package com.qing.owl.auth.application;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.qing.owl.auth.application.user.RegisterService;

import jakarta.annotation.Resource;

@SpringBootTest
public class RegisterServiceTest {

    @Resource
    RegisterService registerService;

    @Test
    public void testSendValidCode() {

    }
}
