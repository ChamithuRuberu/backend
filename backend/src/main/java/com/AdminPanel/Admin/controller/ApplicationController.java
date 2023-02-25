package com.AdminPanel.Admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
    @GetMapping("/index")
    public String gohome(){
        return "index";
    }

    @GetMapping("/AdminRegister")
    public String goadmin(){
        return "AdminRegister";
    }
}
