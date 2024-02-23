package com.prueba.cocinaConCadena.dao;

import com.prueba.cocinaConCadena.entity.Detalle;


import java.util.List;

public interface DetalleDAO {

    void save(Detalle detalle);

    void update(Detalle detalle);

    void delete(Integer id);

    Detalle findById(Integer id);

    List<Detalle> findAll();
}
