package com.alura.literatura.model;

import jakarta.persistence.*;
import jdk.jfr.Description;

@Entity
@Table(name = "obras")
public class Obra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String titulo;
    private String autor;
    private Integer anio;
    private String genero;
    @Column(length = 2000)
    private String descripcion;

    public Obra(String titulo, String autor, Integer anio, String genero, String descripcion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.descripcion = descripcion;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getAnio() {
        return anio;
    }
    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}