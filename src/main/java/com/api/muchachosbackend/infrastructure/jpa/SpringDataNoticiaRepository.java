package com.api.muchachosbackend.infrastructure.jpa;


import com.api.muchachosbackend.domain.model.Noticia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataNoticiaRepository extends JpaRepository<Noticia, Long> { }