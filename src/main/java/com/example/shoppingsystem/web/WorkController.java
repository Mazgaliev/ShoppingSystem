package com.example.shoppingsystem.web;

import com.example.shoppingsystem.service.DodatokService;
import com.example.shoppingsystem.service.ProizvodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/work")
public class WorkController {
    private final ProizvodService proizvodService;
    private final DodatokService dodatokService;

    public WorkController(ProizvodService proizvodService, DodatokService dodatokService) {
        this.proizvodService = proizvodService;
        this.dodatokService = dodatokService;
    }

    @GetMapping
    public String workPage(Model model) {

        model.addAttribute("proizvodi", proizvodService.getAllItems());
        model.addAttribute("dodatoci", dodatokService.getAllDodatoci());

        return "WorkPage";
    }

}