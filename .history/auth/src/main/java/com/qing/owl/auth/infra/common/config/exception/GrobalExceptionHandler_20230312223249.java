package com.qing.owl.auth.infra.common.config.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import com.qing.owl.auth.infra.common.data.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@Slf4j
public class GrobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    @ResponseBody
    public Result<Void> handler(Exception ex) {
        log.error("exception happen", ex);
        System.out.println("123123");
        return Result.fail(ex.getMessage());
    }

}
