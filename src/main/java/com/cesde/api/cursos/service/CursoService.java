package com.cesde.api.cursos.service;

import com.cesde.api.cursos.model.Curso;
import com.cesde.api.cursos.repository.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {
    @Autowired
    private CursoRepository cursoRepository;

    public List<Curso> getAllCursos() {
        return cursoRepository.findAll();
    }

    public Curso getCursoById(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }

    public Curso addCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Curso updateCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deleteCurso(Long id) {
        cursoRepository.deleteById(id);
    }
}
