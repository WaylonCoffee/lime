package com.qing.owl.core.infra.interceptor;

import org.slf4j.MDC;
import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;

import cn.hutool.core.lang.UUID;
import cn.hutool.core.util.StrUtil;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class LogInterceptor implements HandlerInterceptor {

  private static final String TRACE_ID = "TRACE_ID";

  @Override
  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
      @Nullable Exception ex) throws Exception {
    MDC.remove(TRACE_ID);
  }

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
    String traceId = request.getHeader(TRACE_ID);
    if (StrUtil.isEmpty(traceId)) {
      traceId = UUID.randomUUID().toString();
    }
    MDC.put(TRACE_ID, traceId);
    return true;
  }

}
