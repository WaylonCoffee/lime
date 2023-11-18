package com.qing.owl.core.interfaces.controller.assembler;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("about")
public class AboutController {
    
    @GetMapping("health")
    public String health(){
        return "hello";
    }
}
