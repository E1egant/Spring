package com.example.demo.controller;

import com.example.demo.model.Libro;
import com.example.demo.service.LibroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@Service
@RestController
@RequestMapping("/api/v1/libros")
public class LibroController {
    @Autowired
    private LibroService libroService;

    public List<Libro> listaLibros(){
        return libroService.getLibros();
    }

    @PostMapping
    public Libro agregarLibro(@RequestBody Libro libro) {
        return libroService.saveLibro(libro);
    }
    
    @GetMapping("{id}")
    public Libro buscaLibro(@PathVariable int id) {
        return libroService.getLibroId(id);
    }
    
    @PutMapping("{id}")
    public Libro actualizarLibro(@PathVariable int id, @RequestBody Libro libro){
        libro.setId(id);
        return libroService.updateLibro(libro);        
    }

    @DeleteMapping("{id}")
    public String elimiarLibro(@PathVariable int id){
        return libroService.daletelibro(id);
    }
}
