package com.example.shoppingsystem.web;

import com.example.shoppingsystem.service.ProizvodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/create")
public class CreateController {
    private final ProizvodService proizvodService;

    public CreateController(ProizvodService proizvodService) {
        this.proizvodService = proizvodService;
    }

    @GetMapping
    public String createProizvodPage() {
        //TODO implementiraj dodavanje proizvod
        return "createProizvod";
    }

    @PostMapping
    public String create(@RequestParam String ime, @RequestParam Integer cena) {
        proizvodService.createProizvod(ime, cena);

        return "redirect:/work";
    }

}
