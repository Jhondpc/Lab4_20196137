package com.example.lab4.controller;

import com.example.lab4.entity.User;
import com.example.lab4.entity.Vuelo;
import com.example.lab4.repository.ReservaRepository;
import com.example.lab4.repository.UserRepository;
import com.example.lab4.repository.VueloRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/login")
public class LoginController {

    final UserRepository userRepository;
    final VueloRepository vueloRepository;
    final ReservaRepository reservaRepository;

    public LoginController(UserRepository userRepository, VueloRepository vueloRepository, ReservaRepository reservaRepository){
        this.userRepository = userRepository;
        this.vueloRepository = vueloRepository;
        this.reservaRepository = reservaRepository;
    }
    @GetMapping("/")
    public String index(){
        return "inicio";
    }

    @PostMapping("/inicioSesion")
    public String validar(@RequestParam("correo") String email,
                          @RequestParam("contrasena") String password,
                          Model model){
        Optional<User> optUser = userRepository.buscarUser(email, password);
        if(optUser.isPresent()){
            List<Vuelo> listaVuelos = vueloRepository.findAll();
            User user = optUser.get();
            model.addAttribute("user",user);
            model.addAttribute("listaVuelos", listaVuelos);
            return "homePage";
        }else {
            return "redirect:/login/";
        }
    }

    @PostMapping("/reserva")
    public String reservar(@RequestParam("idVuelo") int idVuelo,
                           @RequestParam("idUser") int idUser,
                           @RequestParam("precioVuelo") float precioVuelo){
        reservaRepository.reservarVuelo(precioVuelo,idUser,idVuelo);
        return "xd";
    }

}
