package com.lab;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloController {

    @Get("/test/hello")
    public String hello(){
        return "Hello world";
    }
}
