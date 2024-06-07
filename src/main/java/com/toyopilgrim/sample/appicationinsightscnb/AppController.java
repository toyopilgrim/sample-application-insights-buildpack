package com.toyopilgrim.sample.appicationinsightscnb;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/")
public class AppController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}
