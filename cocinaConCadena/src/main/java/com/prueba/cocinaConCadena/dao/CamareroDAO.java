package com.prueba.cocinaConCadena.dao;

import com.prueba.cocinaConCadena.entity.Camarero;


import java.util.List;

public interface CamareroDAO {

    void save(Camarero camarero);

    void update(Camarero camarero);

    void delete(Integer id);

    Camarero findById(Integer id);

    List<Camarero> findAll();
}
