package com.api.muchachosbackend.application.service;

import jakarta.persistence.*;
import lombok.Data;

import java.time.Duration;
import java.time.LocalDate;

@Entity
@Data
public class MarchaServiceImpl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "codigo_repertorio")
    private String codigoRepertorio;

    private String titulo;
    private String autor;
    private String enlace;
    @Column(name = "fecha_creacion")
    private LocalDate fechaCreación;

    private Duration duracion;


}
