package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidays {
    @GetMapping("/holidays")
    public String getData() {return  "Please  Dev-A and Dve 888 book flights and holiday indigo ticket with 50% discount" ; }
}
