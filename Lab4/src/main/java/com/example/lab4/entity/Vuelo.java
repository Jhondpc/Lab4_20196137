package com.example.lab4.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "vuelo")
public class Vuelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idvuelo")
    private int id;

    @Column(name = "origen")
    private String origen;

    @Column(name = "destino")
    private String destino;

    @Column(name = "fecha_salida")
    private Date fechaSalida;

    @Column(name = "fecha_llegada")
    private Date fechaLlegada;

    @Column(name = "duracion")
    private int duracion;

    @Column(name = "precio")
    private float precio;

    @ManyToOne
    @JoinColumn(name = "aerolinea_idaerolinea")
    private Aerolinea aerolinea;

    @Column(name = "asientos_disponibles")
    private int asientosDisponibles;

    @Column(name = "descripcion")
    private String descripcion;

}

