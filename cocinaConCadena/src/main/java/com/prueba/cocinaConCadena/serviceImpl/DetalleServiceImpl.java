package com.prueba.cocinaConCadena.serviceImpl;

import com.prueba.cocinaConCadena.dto.DetalleDTO;
import com.prueba.cocinaConCadena.entity.Detalle;
import com.prueba.cocinaConCadena.repository.DetalleRepository;
import com.prueba.cocinaConCadena.service.DetalleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class DetalleServiceImpl implements DetalleService {

    @Autowired
    private DetalleRepository detalleRepository;

    @Override
    public List<DetalleDTO> listaDetalles() {

        List<Detalle> detalles = detalleRepository.findAll();
        List<DetalleDTO> detalleDTO = listaDetallesDTO(detalles);

        return detalleDTO;
    }

    @Override
    public Detalle findByID(Long id) {
        Optional<Detalle> detalle = detalleRepository.findById(id);
        return detalle.orElseThrow( () -> new RuntimeException("No se enceuntra el detalle"));
    }

    public List<DetalleDTO> listaDetallesDTO(List<Detalle> listaDetalles){

        return listaDetalles.stream().map(detalle -> {
            DetalleDTO detalleDTO = new DetalleDTO();
            detalleDTO.setId(detalle.getId());
            detalleDTO.setCantidad(detalle.getCantidad());

            return detalleDTO;
        }).collect(Collectors.toList());

    }

}
