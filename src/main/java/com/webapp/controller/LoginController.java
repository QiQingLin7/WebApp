package com.webapp.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @PostMapping("login")
    public Boolean Login(String name, String password) {
        System.out.println("Name:" + name + "Password:" + password);
        if (name.equals("小哥哥") && password.equals("770")) {
            return true;
        } else {
            return false;
        }
    }
}
