package com.prueba.cocinaConCadena.dao;

import com.prueba.cocinaConCadena.entity.Plato;

import java.util.List;

public interface PlatoDAO {

    void save(Plato plato);

    void update(Plato plato);

    void delete(Integer id);

    Plato findById(Integer id);

    List<Plato> findAll();

}
