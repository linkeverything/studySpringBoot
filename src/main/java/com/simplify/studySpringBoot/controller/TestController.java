package com.simplify.studySpringBoot.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping(value = "/test")
    public String testApi(){
        return "Hello API";
    }

    @GetMapping(value = "/{firstPath}/test/{secondPath}")
    public String testApiWithPathVariable(@PathVariable() String firstPath,
                                          @PathVariable() String secondPath){
        return "Hello API - variables: 1)" + firstPath + " 2)" + secondPath;
    }

    @GetMapping(value = "/test2")
    public String testApiWithRequestParam(@RequestParam String abc){
        return "Hello API - requestParam: abc=" + abc;
    }

    @PostMapping(value = "/testpost")
    public String testApiPost(@RequestBody String body){
        return "Hello API - requestParam: body=" + body;
    }
}
