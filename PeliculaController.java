package com.flor.crud_fullstack_angular.controller;

import com.flor.crud_fullstack_angular.entity.Pelicula;
import com.flor.crud_fullstack_angular.service.PeliculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

//RestController - devuelve la información al cliente en formato JSON//
@RestController
@RequestMapping(path = "api/v1/peliculas")
public class PeliculaController {

    /*usamos autowired para enlazar los servicios*/

    @Autowired
    private PeliculaServiceImpl peliculaService;

    @GetMapping
    public List<Pelicula> getAll(){
        return peliculaService.getPeliculas();

    @GetMapping("/{id}")
    public Pelicula getById(@PathVariable("id") Integer id){
        return peliculaService.getPelicula(id);

    }@PostMapping
    public void saveUpdategetAll(@RequestBody Pelicula pelicula){
        peliculaService.saveOrUpdate(pelicula);

    }
    @DeleteMapping("/{id}")
    public void saveUpdategetAll(@PathVariable("id") Integer id){
        peliculaService.delete(id);
    }
}