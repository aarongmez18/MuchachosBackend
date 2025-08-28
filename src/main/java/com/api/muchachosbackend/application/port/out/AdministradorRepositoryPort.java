package com.api.muchachosbackend.application.port.out;

import com.api.muchachosbackend.domain.model.Administrador;

import java.util.List;
import java.util.Optional;

public interface AdministradorRepositoryPort {

    Administrador save(Administrador administrador);
    List<Administrador> findAll();
    Optional<Administrador> findById(Long id);
    void deleteById(Long id);
}
