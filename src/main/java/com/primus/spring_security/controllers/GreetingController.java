package com.primus.spring_security.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greeting")
public class GreetingController {

    @GetMapping
    public ResponseEntity<String> sayHello(){
        return ResponseEntity.ok("Welcome to Spring Security Class");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayBye(){
        return ResponseEntity.ok("See you later");
    }
}
