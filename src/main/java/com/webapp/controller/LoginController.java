package com.webapp.controller;

import com.webapp.entity.User;
import com.webapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@RestController
public class LoginController {
    private final UserService service;

    @Autowired
    public LoginController(UserService service) {
        this.service = service;
    }

    @PostMapping("login")
    public Boolean Login(User user, String name, String password) {
        log.println("Name:" + name + "  " + "Password:" + password);
        user.setName(name);
        user.setPassword(password);
        User nameAndPassword = service.selectByNameAndPassword(user);
        return nameAndPassword != null;
    }
}
