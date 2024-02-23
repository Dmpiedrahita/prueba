package com.prueba.cocinaConCadena.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;


@Entity
@Table(name="DETALLES")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Detalle {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    @Column(name="id_detalle")
    private Long id;

    @Column(name="cantidad")
    private int cantidad;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_plato")
    private Plato plato;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_factura")
    private Factura factura;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Plato getPlato() {
        return plato;
    }

    public void setPlato(Plato plato) {
        this.plato = plato;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Detalle(int cantidad) {
        this.cantidad = cantidad;
    }

    public Detalle(Long id, int cantidad, Plato plato) {
        this.id = id;
        this.cantidad = cantidad;
        this.plato = plato;
    }

    @Override
    public String toString() {
        return "Detalle{" +
                "id=" + id +
                ", cantidad=" + cantidad +
                ", plato=" + plato +
                ", factura=" + factura +
                '}';
    }
}
