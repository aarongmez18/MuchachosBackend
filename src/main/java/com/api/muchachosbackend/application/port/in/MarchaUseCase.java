package com.api.muchachosbackend.application.port.in;

import com.api.muchachosbackend.domain.model.Marcha;

import java.util.List;

public interface MarchaUseCase {
    Marcha crear(Marcha rep);
    Marcha actualizar(Long id, Marcha rep);
    Marcha obtener(Long id);
    List<Marcha> listar();
    void eliminar(Long id);
}
