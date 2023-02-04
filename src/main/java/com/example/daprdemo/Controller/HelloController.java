package com.example.daprdemo.Controller;

import com.example.daprdemo.Services.DaprService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    DaprService daprService;
    
    @GetMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/test")
    public String test(){
        return "index";
    }

    @GetMapping("/put/{key}/{value}")
    public String put(@PathVariable String key, @PathVariable String value){
        daprService.saveState(key, value);
        return "index";
    }

    @GetMapping("/get/{key}")
    public String get(@PathVariable String key){
        return daprService.getState(key);
    }


}
