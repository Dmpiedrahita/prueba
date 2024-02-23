package com.prueba.cocinaConCadena.controller;

import com.prueba.cocinaConCadena.dto.ClienteDTO;
import com.prueba.cocinaConCadena.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@Controller
@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClientService clientService;

//    @GetMapping("/list")
//    public ResponseEntity<List<Cliente>> listClients(){
//
//        List<Cliente> clientes = clientService.maxConsumers();
//
//        return ResponseEntity.ok(clientes);
//
//    }



//    REST
    @GetMapping("/maximos")
    public ResponseEntity<List<ClienteDTO>> maxClients(){

        List<ClienteDTO> clientes = clientService.maxConsumers();

        return ResponseEntity.ok(clientes);

    }
//      Thymeleaf
//    @GetMapping("/maximos")
//    public String clientesMaximos(Model model ){
//
//        List<ClienteDTO> clientes = clientService.maxConsumers();
//
//        model.addAttribute("clientesMax", clientes);
//
//        return "clientes-max";
//
//    }
}
