package com.example.shoppingsystem.web;

import com.example.shoppingsystem.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/create")
public class CreateController {
    private final UserService userService;

    public CreateController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public String createUser(@RequestParam String name,
                             @RequestParam String surname,
                             @RequestParam String phonenum,
                             @RequestParam String username,
                             @RequestParam String password, Model model) {
        userService.createUser(name, surname, phonenum, username, password);

        return "redirect:/home/listAll";
    }
}
