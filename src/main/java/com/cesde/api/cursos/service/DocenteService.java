package com.cesde.api.cursos.service;

import com.cesde.api.cursos.model.Docente;
import com.cesde.api.cursos.repository.DocenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DocenteService {
    @Autowired
    private DocenteRepository docenteRepository;

    public List<Docente> getAllDocentes() {
        return docenteRepository.findAll();
    }

    public Docente getDocenteById(Long id) {
        return docenteRepository.findById(id).orElse(null);
    }

    public Docente addDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public Docente updateDocente(Docente docente) {
        return docenteRepository.save(docente);
    }

    public void deleteDocente(Long id) {
        docenteRepository.deleteById(id);
    }
}

