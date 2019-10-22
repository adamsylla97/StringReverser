package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ReverserController {

    @Autowired
    Reverser reverser;

    @GetMapping("reverse/{value}")
    public String reverseString(@PathVariable String value){
        return reverser.reverseString(value);
    }
}
