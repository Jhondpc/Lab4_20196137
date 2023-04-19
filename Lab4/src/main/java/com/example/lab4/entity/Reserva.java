package com.example.lab4.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "reserva")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private int id;

    @Column(name = "fecha_reserva")
    private Date fechaReserva;

    @Column(name = "precio_total")
    private float precioTotal;

    @Column(name = "estado_pago")
    private String estadoPago;

    @ManyToOne
    @JoinColumn(name = "user_iduser")
    private User user;

    @ManyToOne
    @JoinColumn(name = "vuelo_idvuelo")
    private Vuelo vuelo;

}
