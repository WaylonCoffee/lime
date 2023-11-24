package com.qing.owl.lime.infra.common.exception;

import java.util.Map;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException{
    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode){
        super(format(errorCode.getCode(), errorCode.getMessage()));
        this.errorCode = errorCode;
    }

    public BaseException(ErrorCode errorCode,Throwable cause){
        super(errorCode.getMessage(),cause);
        this.errorCode = errorCode;
    }

    public BaseException(Throwable cause){
        super(cause.getMessage(),cause);
    }

     private static String format(String code, String message) {
        return String.format("[%s]%s", code, message);
    }
}
