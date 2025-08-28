package com.api.muchachosbackend.application.port.in;

import com.api.muchachosbackend.domain.model.Noticia;

import java.util.List;

public interface NoticiaUseCase {
    Noticia crear(Noticia noticia);
    Noticia actualizar(Long id, Noticia noticia);
    Noticia obtener(Long id);
    List<Noticia> listar();
    void eliminar(Long id);
}
