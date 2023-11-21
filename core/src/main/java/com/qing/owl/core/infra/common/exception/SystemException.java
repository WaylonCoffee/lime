package com.qing.owl.core.infra.common.exception;

public class SystemException extends BaseException {

    public SystemException(SystemErrorCode errorCode) {
        super(errorCode);
    }

    public SystemException(Throwable throwable) {
        super(throwable);
    }
}
