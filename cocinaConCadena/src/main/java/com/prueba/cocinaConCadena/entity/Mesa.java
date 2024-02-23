package com.prueba.cocinaConCadena.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity(name="MESAS")
@Table(name="MESAS")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Mesa {

    @Id
    @Column(name="id_mesa")
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="max_comensales")
    private int maxComensales;

    @Column(name="ubicacion")
    private String ubicacion;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "mesa", cascade = CascadeType.ALL)
    private List<Factura> factura;

    public Mesa(int maxComensales, String ubicacion) {
        this.maxComensales = maxComensales;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "id=" + id +
                ", maxComensales=" + maxComensales +
                ", ubicacion='" + ubicacion + '\'' +
                ", factura=" + factura +
                '}';
    }
}
