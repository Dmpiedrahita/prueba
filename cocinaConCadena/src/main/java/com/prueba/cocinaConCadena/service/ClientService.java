package com.prueba.cocinaConCadena.service;

import com.prueba.cocinaConCadena.dto.ClienteDTO;
import com.prueba.cocinaConCadena.entity.Cliente;

import java.util.List;

public interface ClientService {

    List<Cliente> clientList();
    List<ClienteDTO> maxConsumers();


}
