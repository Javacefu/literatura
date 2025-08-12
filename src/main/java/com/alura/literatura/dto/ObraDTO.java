package com.alura.literatura.dto;

import jakarta.persistence.Column;

public record ObraDTO(
        Long id,
        String titulo,
        String autor,
        Integer anio,
        String genero,
        String descripcion){

}
