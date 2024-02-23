package com.prueba.cocinaConCadena.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter @Setter @NoArgsConstructor
@ToString
public class ClienteDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private Double total;

    public ClienteDTO(Long id, String nombre, String apellido, Double total) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.total = total;
    }

    public ClienteDTO(String nombre, String apellido, Double total) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.total = total;
    }
}
