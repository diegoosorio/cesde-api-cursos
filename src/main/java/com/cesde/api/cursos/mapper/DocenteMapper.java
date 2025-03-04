package com.cesde.api.cursos.mapper;

import com.cesde.api.cursos.dto.DocenteDTO;
import com.cesde.api.cursos.model.Docente;
import org.mapstruct.*;

@Mapper(componentModel = "spring")
public interface DocenteMapper {
    DocenteDTO toDto(Docente docente);
    Docente toEntity(DocenteDTO docenteDTO);
}
