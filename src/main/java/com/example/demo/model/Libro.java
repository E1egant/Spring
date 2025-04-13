package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Libro {
    private int id;
    private String isbn;
    private String titulo;
    private String editorial;
    private int fechaPublicacion;
    private String autor;
}

//Eres pero muy buen amigo, te quiero mucho.
