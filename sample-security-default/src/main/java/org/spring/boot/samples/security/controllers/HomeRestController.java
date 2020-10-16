package org.spring.boot.samples.security.controllers;

import lombok.RequiredArgsConstructor;
import org.spring.boot.samples.core.services.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeRestController {

    private final UserService userService;

    @GetMapping("/")
    public String helloWorld() {
        return "Hello, world!";
    }

//    @GetMapping("/login")
//    public String login() {
//        return "Hello, world!";
//    }
}
