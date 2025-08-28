package com.api.muchachosbackend.application.port.in;

import com.api.muchachosbackend.domain.model.Administrador;

import java.util.List;

public interface AdministradorUseCase {
    Administrador crear(Administrador admin);
    Administrador actualizar(Long id, Administrador admin);
    Administrador obtener(Long id);
    List<Administrador> listar();
    void eliminar(Long id);
}
