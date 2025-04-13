package com.example.demo.service;

import com.example.demo.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.LibroRepository;
import java.util.List;

@Service
public class LibroService {
    @Autowired
    private LibroRepository libroRepository;

    public List<Libro> getLibros(){
        return libroRepository.obtenerLibros();
    }

    public Libro saveLibro(Libro libro){
        return libroRepository.guardar(libro);
    }

    public Libro getLibroId(int id){
        return libroRepository.buscarPorId(id);
    }

    public Libro updateLibro(Libro libro){
        return libroRepository.actualizar(libro);
    }

    public String daletelibro(int id){
        libroRepository.elminar(id);
        return "Libro eliminado";
    }
}
