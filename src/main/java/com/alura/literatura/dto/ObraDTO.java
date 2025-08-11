package com.alura.literatura.dto;

import jakarta.persistence.Column;

public class ObraDTO {
    private Long id;
    private String titulo;
    private String autor;
    private Integer anio;
    private String genero;
    private String descripcion;
}
