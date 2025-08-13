package com.alura.literatura.service;

import com.alura.literatura.entity.LibroEntity;
import com.alura.literatura.model.Libro;
import com.alura.literatura.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    private final LibroRepository libroRepository;

    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }

    public List<LibroEntity> listarLibros() {
        return libroRepository.findAll();
    }

    // Otros métodos que necesites
}

