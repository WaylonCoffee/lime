package com.qing.owl.core.domain.exception;

public interface ErrorCode {
    int getStatus();
    String getMessage();
    String getCode();
}
