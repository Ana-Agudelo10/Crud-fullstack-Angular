package com.flor.crud_fullstack_angular.repository;

import com.flor.crud_fullstack_angular.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeliculaRepository extends JpaRepository <Pelicula, Integer> {
}
