package com.qing.owl.core.infra.common.exception;

public interface ErrorCode {
    int getStatus();
    String getMessage();
    String getCode();
}
