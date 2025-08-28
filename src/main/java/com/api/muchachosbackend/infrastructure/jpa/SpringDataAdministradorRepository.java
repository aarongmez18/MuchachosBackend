package com.api.muchachosbackend.infrastructure.jpa;


import com.api.muchachosbackend.domain.model.Administrador;
import com.api.muchachosbackend.domain.model.Marcha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataAdministradorRepository extends JpaRepository<Administrador, Long> { }