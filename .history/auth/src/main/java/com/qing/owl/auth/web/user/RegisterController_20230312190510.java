package com.qing.owl.auth.web.user;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qing.owl.auth.account.command.QueryPhoneValidCodeCommand;
import com.qing.owl.auth.infra.common.data.Result;

@RestController
@RequestMapping("user/register")
public class RegisterController {

    private RegisterService service;

    public Result<Void> vaildCode(QueryPhoneValidCodeCommand codeCommand) {

        return Result.success();
    }

}