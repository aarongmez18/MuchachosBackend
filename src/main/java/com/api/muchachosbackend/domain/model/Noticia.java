package com.api.muchachosbackend.domain.model;

import lombok.*;
import java.time.LocalDate;

@Data @Builder
@NoArgsConstructor @AllArgsConstructor
public class Noticia {
    private Long id;
    private String titulo;
    private String subtitulo;
    private String imagenURL;
    private String texto;
    private LocalDate fechaCreacion;
}
