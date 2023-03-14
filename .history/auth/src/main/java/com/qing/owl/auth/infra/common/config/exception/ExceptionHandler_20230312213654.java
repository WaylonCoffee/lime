package com.qing.owl.auth.infra.common.config.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;

import com.qing.owl.auth.infra.common.data.Result;
import com.qing.owl.auth.infra.common.data.ResultCode;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class ExceptionHandler {

    public Result< handler(Exception ex) {
        log.error("exception happen", ex);
        return Result.fail(ex.getMessage());
    }

}
