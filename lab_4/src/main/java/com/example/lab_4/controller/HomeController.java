package com.example.lab_4.controller;

import com.example.lab_4.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    final UserRepository userRepository;

    public HomeController(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    @GetMapping("")
    public String index(){
        return "inicio";
    }

    @PostMapping("/validar")
    public String validar(@RequestParam("usuario") String usuario, Model model){


        return "homePage";}

}
