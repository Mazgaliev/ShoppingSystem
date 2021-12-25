package com.example.shoppingsystem.web;

import com.example.shoppingsystem.service.DodatokService;
import com.example.shoppingsystem.service.ProizvodService;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final ProizvodService proizvodService;
    private final DodatokService dodatokService;

    public HomeController(ProizvodService proizvodService, DodatokService dodatokService) {
        this.proizvodService = proizvodService;
        this.dodatokService = dodatokService;
    }

    @GetMapping
    public String homePage() {

        return "HomePage";
    }

    @GetMapping("/edit")
   // @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String editProizvPage(Model model) {

        model.addAttribute("proizvodi", proizvodService.getAllItems());

        return "EditProizvod";
    }

    @PostMapping("/edit")
    public String editProizvod(@RequestParam String proizvod, @RequestParam String cena) {
        //TODO implementiraj editiranje na proizvod
        return "redirect:/edit";
    }
}
