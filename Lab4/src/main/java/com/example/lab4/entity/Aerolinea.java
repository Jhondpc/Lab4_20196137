package com.example.lab4.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "aerolinea")
public class Aerolinea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idaerolinea")
    private int id;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "codigo")
    private String codigo;
}
