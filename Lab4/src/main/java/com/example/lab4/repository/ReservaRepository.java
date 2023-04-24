package com.example.lab4.repository;

import com.example.lab4.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ReservaRepository extends JpaRepository<Reserva,Integer> {

    @Query(nativeQuery = true, value="insert into lab4.reserva (fecha_reserva, precio_total, estado_pago, user_iduser, vuelo_idvuelo) values (now(), ?1, 'procesado', ?2, ?3)")
    void reservarVuelo(float precio, int idUser, int idVuelo);
}
