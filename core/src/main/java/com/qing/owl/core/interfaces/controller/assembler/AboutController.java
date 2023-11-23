package com.qing.owl.core.interfaces.controller.assembler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qing.owl.core.infra.common.annotation.ResponseJsonResultBody;
import com.qing.owl.core.infra.common.exception.SystemErrorCode;
import com.qing.owl.core.infra.common.exception.SystemException;

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
