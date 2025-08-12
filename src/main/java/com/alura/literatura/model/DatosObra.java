package com.alura.literatura.model;

public record DatosObra(
        Long id,
        String titulo,
        String autor,
        Integer anio,
        String genero,
        String descripcion) {
}
