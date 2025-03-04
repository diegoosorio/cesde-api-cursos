package com.cesde.api.cursos.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CursoDTO {
    private Long id;
    private String nombre;
    private String descripcion;
    private int duracionSemanas;
    private double precio;
    private LocalDateTime fechaInicio;
    private Long docenteId;

}
