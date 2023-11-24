package com.qing.owl.lime.infra.common.facade;

import java.lang.annotation.Annotation;
import java.util.Objects;

import org.springframework.core.MethodParameter;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;
import com.qing.owl.lime.infra.common.annotation.ResponseJsonResultBody;
import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.json.JSONUtil;
import lombok.SneakyThrows;

@RestControllerAdvice
public class ResponseJsonResultBodyAdvice implements ResponseBodyAdvice<Object>{
    
    private static final Class<? extends Annotation> ANNOTATION_TYPE = ResponseJsonResultBody.class;

    @Override
    @Nullable
    @SneakyThrows
    public Object beforeBodyWrite(@Nullable Object body, MethodParameter returnType, MediaType selectedContentType,
            Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        //如果返回类型是string，那么springmvc是直接返回的，此时需要手动转化为json
        // 当body都为null时，下面的if判断条件都不满足，如果接口返回类似为String，会报错com.shepherd.fast.global.ResponseVO cannot be cast to java.lang.String
        Class<?> returnClass = returnType.getMethod().getReturnType();
       
         // 防止重复包裹的问题出现
        if (body instanceof Result) {
            return body;
        }
       
        if (body instanceof String || Objects.equals(returnClass, String.class)) {
            String value = JSONUtil.toJsonStr(Result.success(body));
            return value;
        }
        return Result.success(body);
    }

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
       return AnnotationUtil.hasAnnotation(returnType.getContainingClass(), ANNOTATION_TYPE) || returnType.hasMethodAnnotation(ANNOTATION_TYPE);
    }   
    
}
