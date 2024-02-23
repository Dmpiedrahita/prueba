package com.prueba.cocinaConCadena.dao;

import com.prueba.cocinaConCadena.entity.Mesa;

import java.util.List;

public interface MesaDAO {

    void save(Mesa mesa);

    void update(Mesa mesa);

    void delete(Integer id);

    Mesa findById(Integer id);

    List<Mesa> findAll();
}
