package com.prueba.cocinaConCadena.service;

import com.prueba.cocinaConCadena.dto.DetalleDTO;
import com.prueba.cocinaConCadena.entity.Detalle;

import java.util.List;

public interface DetalleService {

    List<DetalleDTO> listaDetalles();

    Detalle findByID(Long id);

}
