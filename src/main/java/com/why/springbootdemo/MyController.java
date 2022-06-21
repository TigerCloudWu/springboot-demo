package com.why.springbootdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wuhy on 2022/6/19.
 */
@RestController
public class MyController {
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
