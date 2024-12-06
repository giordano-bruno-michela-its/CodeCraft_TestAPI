package com.codecraft.test_rest_api.controller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@NoArgsConstructor
@Getter
@Setter
@RestController
public class HelloController {
    
    @GetMapping("/")
    public String index() {
        return "Benvenuti in Spring Boot!";
    }
    
}
