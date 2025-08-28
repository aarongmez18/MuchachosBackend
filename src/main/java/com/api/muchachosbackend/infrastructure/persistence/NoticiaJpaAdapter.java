package com.api.muchachosbackend.infrastructure.persistence;

import com.api.muchachosbackend.domain.model.Noticia;
import com.api.muchachosbackend.application.port.out.NoticiaRepositoryPort;
import com.api.muchachosbackend.infrastructure.jpa.SpringDataNoticiaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class NoticiaJpaAdapter implements NoticiaRepositoryPort {

    private final SpringDataNoticiaRepository repository;

    public NoticiaJpaAdapter(SpringDataNoticiaRepository repository) {
        this.repository = repository;
    }

    @Override
    public Noticia save(Noticia noticia) {
        return repository.save(noticia);
    }

    @Override
    public List<Noticia> findAll() {
        return repository.findAll();
    }

    @Override
    public Optional<Noticia> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}