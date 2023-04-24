package com.example.lab_4.controller;

import com.example.lab_4.repository.AerolineaRepository;
import org.springframework.stereotype.Controller;

@Controller
public class AerolineaController {
    final AerolineaRepository aerolineaRepository;

    public AerolineaController(AerolineaRepository aerolineaRepository){
        this.aerolineaRepository = aerolineaRepository;
    }
}
