package com.cesde.api.cursos.controller;

import com.cesde.api.cursos.dto.CursoDTO;
import com.cesde.api.cursos.mapper.CursoMapper;
import com.cesde.api.cursos.model.Curso;
import com.cesde.api.cursos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/cursos")
public class CursoController {
    @Autowired
    private CursoService cursoService;
    @Autowired
    private CursoMapper cursoMapper;

    @GetMapping
    public List<CursoDTO> getAllCursos() {
        return cursoService.getAllCursos().stream().map(cursoMapper::toDto).collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public CursoDTO getCursoById(@PathVariable Long id) {
        return cursoMapper.toDto(cursoService.getCursoById(id));
    }

    @PostMapping
    public CursoDTO addCurso(@RequestBody CursoDTO cursoDTO) {
        Curso curso = cursoMapper.toEntity(cursoDTO);
        return cursoMapper.toDto(cursoService.addCurso(curso));
    }

    @PutMapping
    public CursoDTO updateCurso(@RequestBody CursoDTO cursoDTO) {
        Curso curso = cursoMapper.toEntity(cursoDTO);
        return cursoMapper.toDto(cursoService.updateCurso(curso));
    }

    @DeleteMapping("/{id}")
    public void deleteCurso(@PathVariable Long id) {
        cursoService.deleteCurso(id);
    }
}