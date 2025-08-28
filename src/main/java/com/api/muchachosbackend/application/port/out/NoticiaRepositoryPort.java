package com.api.muchachosbackend.application.port.out;

import com.api.muchachosbackend.domain.model.Noticia;

import java.util.List;
import java.util.Optional;

public interface NoticiaRepositoryPort {
    Noticia save(Noticia noticia);
    List<Noticia> findAll();
    Optional<Noticia> findById(Long id);
    void deleteById(Long id);
}