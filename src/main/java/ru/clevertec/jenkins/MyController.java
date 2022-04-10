package ru.clevertec.jenkins;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jenkins-api/v1")
public class MyController {
    @GetMapping
    public String hello() {
        return "Hello from Jenkins";
    }
}
