package com.prueba.cocinaConCadena.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="FACTURAS")
@Getter
@Setter
@ToString
public class Factura {

    @Id
    @Column(name="id_factura")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="fecha")
    private LocalDate fecha;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_mesa")
    private Mesa mesa;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_camarero")
    private Camarero camarero;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Detalle> detalles = new ArrayList<>();


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Camarero getCamarero() {
        return camarero;
    }

    public void setCamarero(Camarero camarero) {
        this.camarero = camarero;
    }

    public List<Detalle> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<Detalle> detalles) {
        this.detalles = detalles;
    }

    public Factura(LocalDate fecha, Mesa mesa, Cliente cliente, Camarero camarero, List<Detalle> detalle) {
        this.fecha = fecha;
        this.mesa = mesa;
        this.cliente = cliente;
        this.camarero = camarero;
        this.detalles = detalle;
    }

    public Factura(Long id, LocalDate fecha, Mesa mesa, Cliente cliente, Camarero camarero, List<Detalle> detalles) {
        this.id = id;
        this.fecha = fecha;
        this.mesa = mesa;
        this.cliente = cliente;
        this.camarero = camarero;
        this.detalles = detalles;
    }

    public Factura() {

    }

    @Override
    public String toString() {
        return "Factura{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", mesa=" + mesa +
                ", cliente=" + cliente +
                ", camarero=" + camarero +
                ", detalles=" + detalles +
                '}';
    }
}
