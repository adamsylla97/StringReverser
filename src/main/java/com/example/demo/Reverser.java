package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class Reverser {

    public String reverseString(String value){
        StringBuilder newValue = new StringBuilder();
        for(int i=0; i<value.length(); i++){
            newValue.append(value.charAt(value.length() -1 -i));
        }
        return newValue.toString();
    }

}
