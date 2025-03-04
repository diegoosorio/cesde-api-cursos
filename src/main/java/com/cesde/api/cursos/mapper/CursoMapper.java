package com.cesde.api.cursos.mapper;

import com.cesde.api.cursos.dto.CursoDTO;
import com.cesde.api.cursos.model.Curso;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface CursoMapper {
    CursoDTO toDto(Curso curso);
    Curso toEntity(CursoDTO cursoDTO);
}
