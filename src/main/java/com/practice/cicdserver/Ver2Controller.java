package com.practice.cicdserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ver2Controller {
    @GetMapping("/ver2")
    public String home(){
        return "ArgoCD , Service add";
    }
}
