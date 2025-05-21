package com.flor.crud_fullstack_angular.service;

import com.flor.crud_fullstack_angular.entity.Pelicula;
import java.util.List;

public interface PeliculaService {
    Pelicula save(Pelicula pelicula);
    List<Pelicula> findAll();
    Pelicula findById (Integer id);
    void deleteById (Integer id);
    Pelicula update (Pelicula pelicula);
}
