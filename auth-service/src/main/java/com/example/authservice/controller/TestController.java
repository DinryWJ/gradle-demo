package com.example.authservice.controller;

import com.example.authservice.service.FoobarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dinry
 * @date 2022/12/2 16:46
 */
@RestController
public class TestController {
    @Autowired
    private FoobarService foobarService;

    @GetMapping("/test")
    public String test() {
        return foobarService.receiveGreeting("fester");
    }
}
