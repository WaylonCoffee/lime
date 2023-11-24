package com.qing.owl.lime.infra.common.exception;

public interface ErrorCode {
    int getStatus();
    String getMessage();
    String getCode();
}
