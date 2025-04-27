package com.example.makemytrip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class holidays {
    @GetMapping("/holidays")
    public String getData() {return  "sssss book your hotels from mmt kindly book ticket for New Delhi to anywhere at 20% discount" ; }
}
