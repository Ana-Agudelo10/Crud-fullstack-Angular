package com.flor.crud_fullstack_angular.service;

import com.flor.crud_fullstack_angular.entity.Pelicula;
import com.flor.crud_fullstack_angular.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*Hacemos una inyección con @autowired y luego llamamos el repositorio
* creamos una lista para guardar el listado de peliculas y luego recurrimos}
* alrepositorio para buscar todos los resultados almacenados(findAll)*/
@Service
public class PeliculaServiceImpl{
    @Autowired
    PeliculaRepository peliculaRepository;

    public List<Pelicula>getPeliculas(){
        return peliculaRepository.findAll();

    }
    public Optional<Pelicula> getPelicula(Integer id) {
        return peliculaRepository.findById(id);
    }

    public void saveOrUpdate(Pelicula pelicula){
        peliculaRepository.save(pelicula);
    }

    public void delete(Integer id){
        peliculaRepository.deleteById(id);
    }

}
