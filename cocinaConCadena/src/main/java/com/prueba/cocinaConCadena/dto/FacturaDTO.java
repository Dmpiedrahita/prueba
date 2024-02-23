package com.prueba.cocinaConCadena.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class FacturaDTO {

    private Long id;
    private String nombreCliente;
    private String apellidoCliente;
    private List<String> platos;
    private String nombreCamarero;
    private String apellidoCamarero;
    private Long cantidad;
    private String mes;
    private Double totalCamarero;
    private Double totalFactura;

    public FacturaDTO(String nombre, String apellido, String mes, Double total) {
        this.nombreCliente = nombre;
        this.apellidoCliente = apellido;
        this.mes = mes;
        this.totalCamarero = total;
    }

    public FacturaDTO(Long id, String nommbreCamarero, String apellidoCamarero, String mes, Double total) {
        this.id = id;
        this.nombreCamarero = nommbreCamarero;
        this.apellidoCamarero = apellidoCamarero;
        this.mes = mes;
        this.totalCamarero = total;
    }

    public FacturaDTO(Long id, String nombreCliente, String apellidoCliente, String nombreCamarero , String apellidoCamarero, Double totalFactura) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
        this.nombreCamarero = nombreCamarero;
        this.apellidoCamarero = apellidoCamarero;
        this.totalFactura = totalFactura;
    }


}
