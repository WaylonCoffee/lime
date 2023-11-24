package com.qing.owl.lime.infra.common.exception;

public class SystemException extends BaseException {

    public SystemException(SystemErrorCode errorCode) {
        super(errorCode);
    }

    public SystemException(Throwable throwable) {
        super(throwable);
    }
}
