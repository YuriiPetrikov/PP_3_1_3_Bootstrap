package com.example.PP_3_1_3_Bootstrap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
    @GetMapping(value = "/login")
    public String loginPage(){
        return "/index";
    }
}
