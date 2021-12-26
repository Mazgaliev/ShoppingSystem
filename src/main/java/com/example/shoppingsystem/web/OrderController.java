package com.example.shoppingsystem.web;

import com.example.shoppingsystem.model.Naracka;
import com.example.shoppingsystem.model.Proizvod;
import com.example.shoppingsystem.service.DodatokService;
import com.example.shoppingsystem.service.NarackaService;
import com.example.shoppingsystem.service.ProizvodService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderController {
    private final ProizvodService proizvodService;
    private final DodatokService dodatokService;
    private final NarackaService narackaService;

    public OrderController(ProizvodService proizvodService, DodatokService dodatokService, NarackaService narackaService) {
        this.proizvodService = proizvodService;
        this.dodatokService = dodatokService;
        this.narackaService = narackaService;
    }

    @PostMapping
    public String makeOrder() {

        return "redirect:/work/order";
    }

}
