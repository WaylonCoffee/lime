package com.qing.owl.lime.infra.common.exception;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qing.owl.lime.infra.common.facade.Result;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 处理自定义的业务异常
     * @param req
     * @param e
     * @return
     */
    @ExceptionHandler(value = SystemException.class)
    @ResponseBody
    public Result<?> bizExceptionHandler(HttpServletRequest req,HttpServletRequest response, SystemException e){
        log.error("业务异常:", e);
        return Result.fail(e.getErrorCode());
    }

    
    @ExceptionHandler({MethodArgumentNotValidException.class})
    @ResponseBody
    public Result<?> handleInvalidRequest(MethodArgumentNotValidException ex, HttpServletRequest request) {
        log.error("参数验证异常[{}]:{}", ex.getParameter().getParameterType().getName(), ex);
        return Result.fail(new SystemException(SystemErrorCode.REQUEST_VALIDATION_FAILED).getErrorCode());
    }


    @ExceptionHandler(Throwable.class)
    @ResponseBody
    public Result<?> handleGeneralException(Throwable ex, HttpServletRequest request) {
        log.error("未知异常：",ex);
        return Result.fail(new SystemException(ex).getErrorCode());
    }
}
