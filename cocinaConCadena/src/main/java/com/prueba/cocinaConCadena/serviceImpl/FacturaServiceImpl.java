package com.prueba.cocinaConCadena.serviceImpl;

import com.prueba.cocinaConCadena.dto.FacturaDTO;
import com.prueba.cocinaConCadena.entity.Factura;
import com.prueba.cocinaConCadena.repository.FacturaRepository;
import com.prueba.cocinaConCadena.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {


    @Autowired
    private FacturaRepository facturaRepository;

    @Override
    public List<FacturaDTO> listFacturasMensual() {

        return facturaRepository.facturasMes();
    }

    @Override
    public List<FacturaDTO> listFacturas(){
        return facturaRepository.facturasTotal();

    }

    @Override
    public void save(Factura factura) {
        facturaRepository.save(factura);
    }

}
