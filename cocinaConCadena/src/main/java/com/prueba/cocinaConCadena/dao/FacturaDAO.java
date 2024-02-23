package com.prueba.cocinaConCadena.dao;

import com.prueba.cocinaConCadena.entity.Factura;

import java.util.List;

public interface FacturaDAO {

    void save(Factura factura);

    Factura findById(Integer id);

    List<Factura> findAll();
}
