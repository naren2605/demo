package com.expedia.restcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestRestController {

    @RequestMapping("/hello")
    public String getHello(){
        return "hello";
    }
}
