package com.api.muchachosbackend.domain.model;

import lombok.*;


@Data @Builder @NoArgsConstructor @AllArgsConstructor
public class Administrador {
    private Long id;
    private String usuario;
    private String email;
}
