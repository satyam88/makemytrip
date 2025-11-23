package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class add {
    @GetMapping("/add")
    public String getData() {return  "Please book addd ticket from makemytrip at 10% discount" ; }
}

