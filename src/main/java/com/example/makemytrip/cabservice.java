package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cabservice {
    @GetMapping("/cabservice")
    public String getData() {return  "Please dev-B dev-A book flights indigo ticket with 50% discount" ; }
}