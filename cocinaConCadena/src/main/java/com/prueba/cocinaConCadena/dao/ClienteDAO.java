package com.prueba.cocinaConCadena.dao;

import com.prueba.cocinaConCadena.entity.Cliente;


import java.util.Collection;
import java.util.List;

public interface ClienteDAO {

    void save(Cliente cliente);

    void update(Cliente cliente);

    void delete(Integer id);

    Cliente findById(Integer id);

    List<Cliente> findAll();

    List<Collection> findMaxConsumers();

}
