package com.qing.owl.core.domain.exception;

public class SystemException extends BaseException {

    public SystemException(SystemErrorCode errorCode) {
        super(errorCode);
    }
    
}
