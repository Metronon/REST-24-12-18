package com.ll.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
    @GetMapping()
    public String root() {
        return "redirect:/api/v1/posts";
    }
}
