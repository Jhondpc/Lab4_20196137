package com.example.lab4.controller;

import com.example.lab4.repository.AerolineaRepository;
import com.example.lab4.repository.UserRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AerolineaController {
    final AerolineaRepository aerolineaRepository;

    public AerolineaController(AerolineaRepository aerolineaRepository){
        this.aerolineaRepository = aerolineaRepository;
    }
}
