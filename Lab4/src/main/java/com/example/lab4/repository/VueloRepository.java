package com.example.lab4.repository;

import com.example.lab4.entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloRepository extends JpaRepository<Vuelo,Integer> {
}
