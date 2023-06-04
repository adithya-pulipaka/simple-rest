package com.adithyakashyap.simplerest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController {

    @GetMapping("/")
    public String hello() {
        return "Hello, World!";
    }

    @GetMapping("/time")
    public long time() {
        return System.currentTimeMillis();
    }
}
