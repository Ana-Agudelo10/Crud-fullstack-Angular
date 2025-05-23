package com.flor.crud_fullstack_angular.entity;

import jakarta.persistence.*;
import lombok.Data;

/*usamos data de lombok para evitar agregar los sets y gets*
identity: forma automatica*/

@Data
@Entity
@Table(name ="peliculas")
public class Pelicula {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String genero;
    private String fechacreacion;
    private String director;
    private String elenco;
    private String imagen;


}
