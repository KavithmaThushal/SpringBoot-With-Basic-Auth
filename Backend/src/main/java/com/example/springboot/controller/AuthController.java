package com.example.springboot.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @GetMapping("/check")
    public String checkAuth() {
        String authMsg = "Authenticated successfully!";
        System.out.println(authMsg);
        return authMsg;
    }
}