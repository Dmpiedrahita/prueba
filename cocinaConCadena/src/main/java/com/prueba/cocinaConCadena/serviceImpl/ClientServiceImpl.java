package com.prueba.cocinaConCadena.serviceImpl;

import com.prueba.cocinaConCadena.dto.ClienteDTO;
import com.prueba.cocinaConCadena.repository.ClientRepository;
import com.prueba.cocinaConCadena.entity.Cliente;
import com.prueba.cocinaConCadena.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;


    public List<Cliente> clientList() {
        return clientRepository.findAll();
    }

    @Override
    public List<ClienteDTO> maxConsumers() {

        return clientRepository.findMaxClients();

    }
}
