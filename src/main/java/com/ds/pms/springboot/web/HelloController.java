package com.ds.pms.springboot.web;

import com.ds.pms.springboot.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    public HelloResponseDto helloDto(@RequestParam("name") String name,  @RequestParam("amount") int amount){
        return new HelloResponseDto(name, amount);
    }
}

