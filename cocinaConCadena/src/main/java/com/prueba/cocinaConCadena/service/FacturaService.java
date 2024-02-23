package com.prueba.cocinaConCadena.service;

import com.prueba.cocinaConCadena.dto.FacturaDTO;
import com.prueba.cocinaConCadena.entity.Factura;

import java.util.List;

public interface FacturaService{
    List<FacturaDTO> listFacturasMensual();

    List<FacturaDTO> listFacturas();

    void save(Factura factura);

}
