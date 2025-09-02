package br.com.edukacode.api;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GeneroRepository extends JpaRepository<Genero,Long>{

    // JpaRepositoty estão presentes na interface.
}
