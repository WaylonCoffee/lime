package com.qing.owl.core.interfaces.controller.assembler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("about")
@Slf4j
public class AboutController {
    
    @GetMapping("health")
    public String health(){
      log.error("null32423");
        return "hello";
    }
}
