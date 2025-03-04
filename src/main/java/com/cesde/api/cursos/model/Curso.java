package com.cesde.api.cursos.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;
    private int duracionSemanas;
    private double precio;
    private LocalDateTime fechaInicio;

    @ManyToOne
    @JoinColumn(name = "docente_id")
    private Docente docente;

}
