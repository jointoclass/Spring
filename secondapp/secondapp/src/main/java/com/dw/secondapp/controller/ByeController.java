package com.dw.secondapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ByeController {
    @GetMapping("/mypages")
    public String page() {
        return "I Love Myself, All The Times.";
}
}
