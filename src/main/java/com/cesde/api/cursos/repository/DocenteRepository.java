package com.cesde.api.cursos.repository;

import com.cesde.api.cursos.model.Docente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DocenteRepository extends JpaRepository<Docente, Long> {
}
