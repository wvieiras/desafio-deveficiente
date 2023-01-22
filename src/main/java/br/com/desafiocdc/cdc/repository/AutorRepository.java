package br.com.desafiocdc.cdc.repository;

import br.com.desafiocdc.cdc.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {
}
