package com.qing.owl.auth.web.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.qing.owl.auth.account.command.QueryPhoneValidCodeCommand;
import com.qing.owl.auth.application.user.RegisterService;
import com.qing.owl.auth.infra.common.data.Result;

import jakarta.annotation.Resource;

@RestController
@RequestMapping("register")
public class RegisterController {

    @Resource
    private RegisterService service;

    @GetMapping("/sendCode")
    @ResponseBody
    public Result<String> sendVaildCode(QueryPhoneValidCodeCommand codeCommand) {
        service.sendValidCode(codeCommand);
        return Result.success();
    }

}