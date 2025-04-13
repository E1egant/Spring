package com.example.demo.repository;

import com.example.demo.model.Libro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LibroRepository {

    // Arreglo que guardara todos los libros
    private List<Libro> listaLibros = new ArrayList<>();

    // Metodo que retorna todos los libros
    public List<Libro> obtenerLibros(){
        return listaLibros;
    }

    //Buscar un libro por su id
    public Libro buscarPorId(int id){
        for(Libro libro : listaLibros){
            if(libro.getId() == id){
                return libro;
            }
        }
        return null;
    }

    // Buscar libro por su isbn
    public Libro buscarPorIsbn(String isbn){
        for(Libro libro : listaLibros){
            if(libro.getIsbn().equals(isbn)){
                return libro;
            }
        }
        return null;
    }

    // Guarda libros en la lista
    public Libro guardar(Libro libro){
        listaLibros.add(libro);
        return libro;
    }

    // Actualiza los libros por su id
    public Libro actualizar(Libro libro){
        int id = 0;
        int idPosicion = 0;

        for(int i=0; i<listaLibros.size(); i++){
            if(listaLibros.get(i).getId() == libro.getId()){
                id = libro.getId();
                idPosicion = i;
            }
        }

        Libro libro1 = new Libro();
        libro1.setId(id);
        libro1.setTitulo(libro.getTitulo());
        libro1.setAutor(libro.getAutor());
        libro1.setFechaPublicacion(libro.getFechaPublicacion());
        libro1.setEditorial(libro.getEditorial());
        libro1.setIsbn(libro.getIsbn());

        listaLibros.set(idPosicion, libro1);
        return libro1;
    }

    // Elimia libros por su id
    public void elminar(int id){
        listaLibros.removeIf(x -> x.getId() == id);
    }
}