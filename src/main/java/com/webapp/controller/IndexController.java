package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping(value = "/")
    public String Index() {
        return "index";
    }

    @GetMapping("/nice")
    public String Nice() {
        return "nice";
    }
}
