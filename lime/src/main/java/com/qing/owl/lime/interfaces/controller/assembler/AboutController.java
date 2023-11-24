package com.qing.owl.lime.interfaces.controller.assembler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qing.owl.lime.infra.common.annotation.ResponseJsonResultBody;
import com.qing.owl.lime.infra.common.exception.SystemErrorCode;
import com.qing.owl.lime.infra.common.exception.SystemException;

@RequestMapping("about")
@RestController
@ResponseJsonResultBody
public class AboutController {
    
    @GetMapping("health")
    public String health(){
        throw new SystemException(SystemErrorCode.REQUEST_VALIDATION_FAILED);
        //return "hello";
    }
}
