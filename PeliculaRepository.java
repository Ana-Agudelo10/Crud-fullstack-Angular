package com.flor.crud_fullstack_angular.repository;

import com.flor.crud_fullstack_angular.entity.Pelicula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/*hacemos una extensión de JpaRepository que especifique que clase usamos, en este caso
* pelicula*/

@Repository
public interface PeliculaRepository extends JpaRepository <Pelicula, Integer> {
}
