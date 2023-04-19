package com.example.lab4.repository;

import com.example.lab4.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<Reserva,Integer> {
}
