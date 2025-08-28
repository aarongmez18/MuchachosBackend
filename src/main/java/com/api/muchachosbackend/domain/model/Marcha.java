package com.api.muchachosbackend.domain.model;

import lombok.*;

import java.time.Duration;
import java.time.LocalDate;


@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Marcha {
    private Long id;
    private String codigoRepertorio;
    private String titulo;
    private String autor;
    private String enlace;
    private LocalDate fechaCreación;
    private Duration duracion;
}
