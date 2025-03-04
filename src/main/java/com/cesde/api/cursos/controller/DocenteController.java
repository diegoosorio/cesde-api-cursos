package com.cesde.api.cursos.controller;

import com.cesde.api.cursos.dto.DocenteDTO;
import com.cesde.api.cursos.mapper.DocenteMapper;
import com.cesde.api.cursos.model.Docente;
import com.cesde.api.cursos.service.DocenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/docentes")
public class DocenteController {
    @Autowired
    private DocenteService docenteService;
    @Autowired
    private DocenteMapper docenteMapper;

    @GetMapping
    public List<DocenteDTO> getAllDocentes() {
        return docenteService.getAllDocentes().stream().map(docenteMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public DocenteDTO getDocenteById(@PathVariable Long id) {
        return docenteMapper.toDto(docenteService.getDocenteById(id));
    }

    @PostMapping
    public DocenteDTO addDocente(@RequestBody DocenteDTO docenteDTO) {
        Docente docente = docenteMapper.toEntity(docenteDTO);
        return docenteMapper.toDto(docenteService.addDocente(docente));
    }

    @PutMapping
    public DocenteDTO updateDocente(@RequestBody DocenteDTO docenteDTO) {
        Docente docente = docenteMapper.toEntity(docenteDTO);
        return docenteMapper.toDto(docenteService.updateDocente(docente));
    }

    @DeleteMapping("/{id}")
    public void deleteDocente(@PathVariable Long id) {
        docenteService.deleteDocente(id);
    }
}