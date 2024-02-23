package com.prueba.cocinaConCadena.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="CLIENTES")
@Getter @Setter @NoArgsConstructor @ToString
public class Cliente {

    @Id
    @Column(name="id_cliente")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre_cliente")
    private String nombre;

    @Column(name="apellido_cliente")
    private String apellido;

    @OneToMany( mappedBy = "cliente", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas = new ArrayList<>();

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(Long id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
