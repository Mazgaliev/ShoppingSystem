package com.example.shoppingsystem.web;

import com.example.shoppingsystem.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/home")
public class HomeController {
    private final UserService userService;

    public HomeController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String viewHome() {

        return "homePage";
    }

    @GetMapping("/listAll")

    public String listAllUsers(Model model) {
        model.addAttribute("users", userService.listAllUsers());

        return "userList";
    }
}
