package com.example.bilgisayar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BilgisayarController {
    @GetMapping ("/main")
        public String mainPageG(){
            return "Bilgisay";
        }
        @PostMapping("/main")
        public String mainPageP(String name, String cardNumber, String email){
            System.out.println(name+" "+cardNumber+" "+email);
            return "Bilgisay";
        }
}
