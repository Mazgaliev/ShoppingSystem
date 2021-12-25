package com.example.shoppingsystem.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/create")
public class CreateController {

    @GetMapping
    public String createProizvodPage() {

        return "createProizvod";
    }

}
