package com.qing.owl.core.infra.common.exception;

import lombok.Getter;

@Getter
public abstract class BaseException extends RuntimeException{
    private ErrorCode errorCode;

    public BaseException(ErrorCode errorCode){
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public BaseException(ErrorCode errorCode,Throwable cause){
        super(errorCode.getMessage(),cause);
        this.errorCode = errorCode;
    }
}
