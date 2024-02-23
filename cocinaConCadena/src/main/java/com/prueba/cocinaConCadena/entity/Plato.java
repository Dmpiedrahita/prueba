package com.prueba.cocinaConCadena.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="PLATOS")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Plato {

    @Id
    @Column(name="id_plato")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="nombre_plato")
    private String nombre;

    @Column(name="precio")
    private Double precio;

    public Plato(String nombre, Double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

}
