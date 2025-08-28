package com.api.muchachosbackend.application.port.out;

import com.api.muchachosbackend.domain.model.Marcha;

import java.util.List;
import java.util.Optional;

public interface MarchaRepositoryPort {

    Marcha save(Marcha marcha);
    List<Marcha> findAll();
    Optional<Marcha> findById(Long id);
    void deleteById(Long id);
}
