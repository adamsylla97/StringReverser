package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ReverserController {

    @GetMapping("reverse/{value}")
    public String reverseString(@PathVariable String value){
        StringBuilder newValue = new StringBuilder();
        for(int i=0; i<value.length(); i++){
            newValue.append(value.charAt(value.length() -1 -i));
        }
        return newValue.toString();
    }
}
