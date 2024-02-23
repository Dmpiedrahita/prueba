package com.prueba.cocinaConCadena.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name="CAMAREROS")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Camarero {

    @Id
    @Column(name="id_camarero")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_camarero")
    private String nombre;

    @Column(name="apellido_camarero")
    private String apellido;

    @OneToMany(mappedBy = "camarero", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;

    public Camarero(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Camarero(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
