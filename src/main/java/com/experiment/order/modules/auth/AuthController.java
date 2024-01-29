package com.experiment.order.modules.auth;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/api/v1/auth/")
public class AuthController {

    @RequestMapping("login")
    public String login(){
        return "login";
    }
}
