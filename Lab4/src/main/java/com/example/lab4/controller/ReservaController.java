package com.example.lab4.controller;

import com.example.lab4.entity.User;
import com.example.lab4.entity.Vuelo;
import com.example.lab4.repository.ReservaRepository;
import com.example.lab4.repository.UserRepository;
import com.example.lab4.repository.VueloRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@RequestMapping("/reserva")
@Controller
public class ReservaController {

    final ReservaRepository reservaRepository;
    final UserRepository userRepository;
    final VueloRepository vueloRepository;
    public ReservaController(ReservaRepository reservaRepository, UserRepository userRepository, VueloRepository vueloRepository){
        this.reservaRepository = reservaRepository;
        this.userRepository = userRepository;
        this.vueloRepository = vueloRepository;
    }

    @PostMapping("/registrarReserva")
    public String reservar(@RequestParam("idVuelo") int idVuelo,
                           @RequestParam("idUser") int idUser,
                           @RequestParam("precioVuelo") float precioVuelo,
                           Model model){
        reservaRepository.reservarVuelo(precioVuelo,idUser,idVuelo);
        Optional<User> optionalUser = userRepository.findById(idUser);
        User user = optionalUser.get();
        List<Vuelo> listaVuelos = vueloRepository.findAll();
        model.addAttribute("user", user);
        model.addAttribute("listaVuelos", listaVuelos);
        return "homePage";
    }
}
