package com.example.shoppingsystem.web;

import com.example.shoppingsystem.model.Dodatok;
import com.example.shoppingsystem.model.Naracka;
import com.example.shoppingsystem.model.Proizvod;
import com.example.shoppingsystem.service.DodatokService;
import com.example.shoppingsystem.service.NarackaService;
import com.example.shoppingsystem.service.ProizvodService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.*;

@Controller
@RequestMapping(value = {"/work", "/"})
public class WorkController {
    private final ProizvodService proizvodService;
    private final DodatokService dodatokService;
    private final NarackaService narackaService;
    private List<Proizvod> proizvodi = new ArrayList<>();

    //TODO implementiraj da mozhe da dodades poveke proizvodi vo naracka
    public WorkController(ProizvodService proizvodService, DodatokService dodatokService, NarackaService narackaService) {
        this.proizvodService = proizvodService;
        this.dodatokService = dodatokService;
        this.narackaService = narackaService;
    }

    //TODO finish implementing kocka so proizvode so ke gi naraces9
    @GetMapping("/add{foodId}")
    public String addProduct(@PathVariable Long foodId) {
        proizvodi.add(proizvodService.getProizvById(foodId));
        return "redirect:/work";
    }

    @GetMapping("/dodatok{dodatokId}")
    public String addDodatok(@PathVariable Long dodatokId) {

//        dodatokList.add(dodatokService.getDodatokById(dodatokId));

        return "redirect:/work";
    }

    @GetMapping("/order")
    public String makeOrder() {
        String name = "naracka";
        Naracka naracka = new Naracka(name);

        naracka.setProzvodi(proizvodi);
        naracka.setCena(proizvodi.stream().mapToInt(Proizvod::getCena).sum());
        narackaService.createNaracka(naracka);
        proizvodi.clear();
        return "redirect:/work";
    }

    @GetMapping("/clear")
    public String clearOrder() {
        proizvodi.clear();
        return "redirect:/home";
    }

    @GetMapping
    public String workPage(Model model) {

        model.addAttribute("proizvodi", proizvodService.getAllItems());
        model.addAttribute("dodatoci", dodatokService.getAllDodatoci());
        model.addAttribute("naracki", narackaService.getTodaysOrders());
        model.addAttribute("momentalnaNaracka", proizvodi);
        model.addAttribute("cena", proizvodi.stream().mapToInt(Proizvod::getCena).sum());
        return "WorkPageBs";
    }

    @GetMapping("/delete/{fId}")
    public String delProductFromNaracka(@PathVariable Long fId) {
        for (Proizvod proizvod : proizvodi) {
            if (proizvod.getId().equals(fId)) {
                proizvodi.remove(proizvod);
                break;
            }
        }
        return "redirect:/work";
    }
//    @GetMapping("/abc")
//    public String workPage2(Model model) {
//        model.addAttribute("proizvodi", proizvodService.getAllItems());
//        model.addAttribute("dodatoci", dodatokService.getAllDodatoci());
//        model.addAttribute("naracki", narackaService.getTodaysOrders());
//        model.addAttribute("momentalnaNaracka", proizvodi);
//        return "WorkPageBs";
//    }

}
