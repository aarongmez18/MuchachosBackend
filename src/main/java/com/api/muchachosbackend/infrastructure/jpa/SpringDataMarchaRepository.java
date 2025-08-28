package com.api.muchachosbackend.infrastructure.jpa;


import com.api.muchachosbackend.domain.model.Marcha;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataMarchaRepository extends JpaRepository<Marcha, Long> { }