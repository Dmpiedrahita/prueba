package com.prueba.cocinaConCadena.controller;


import com.prueba.cocinaConCadena.dto.DetalleDTO;
import com.prueba.cocinaConCadena.dto.FacturaDTO;
import com.prueba.cocinaConCadena.entity.Camarero;
import com.prueba.cocinaConCadena.entity.Cliente;
import com.prueba.cocinaConCadena.entity.Detalle;
import com.prueba.cocinaConCadena.entity.Factura;
import com.prueba.cocinaConCadena.repository.DetalleRepository;
import com.prueba.cocinaConCadena.service.DetalleService;
import com.prueba.cocinaConCadena.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
//@RestController
@RequestMapping("/factura")
public class FacturaController {


    @Autowired
    private FacturaService facturaService;

    @Autowired
    private DetalleRepository detalleRepository;

    @Autowired
    private DetalleService detalleService;

    @GetMapping("/detalles")
    public String listaDetalles(Model model){

        List<Detalle> listaDetalles = detalleRepository.findAll();

        model.addAttribute("detalles", listaDetalles);

        return "nuevaFactura.html";

    }

    @GetMapping("/lista")
    public String listFacturas(Model model){

        List<FacturaDTO> listFacturas = facturaService.listFacturas();

        model.addAttribute("facturas", listFacturas);

        return "facturas.html";

    }

    @GetMapping("/formFactura")
    public String formFactura(Model model){

        Factura factura = new Factura();


        model.addAttribute("factura", factura);

        return "nuevaFactura.html";

    }


//    @GetMapping("/lista")
//    public ResponseEntity<List<Factura>> listaFacturas( ){
//
//        List<Factura> listaFacturas = facturaService.listFacturas();
//
//        return ResponseEntity.ok(listaFacturas);
//    }


//    REST
//    @GetMapping("/mes")
//    public ResponseEntity<List<FacturaDTO>> facturasMes( ){
//
//        List<FacturaDTO> facturas = facturaService.listFacturasMensual();
//
//        return ResponseEntity.ok(facturas);
//
//    }

    @GetMapping("/mes")
    public String facturasMes(Model model){

        List<FacturaDTO> facturas = facturaService.listFacturasMensual();

        model.addAttribute("facturasMes", facturas);

        return "facturas-mes.html";

    }

    @PostMapping("/guardar")
    public String guardarFactura (@RequestParam Long cliente, @RequestParam Long camarero, @RequestParam("fecha") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fecha, @RequestParam String detalleId)  {

        Cliente clien = new Cliente(cliente,"cliente4","cliente4");
        Camarero cam = new Camarero(camarero,"camarero4", "camarero4");

        Long num = Long.parseLong(detalleId);

        Detalle detalle = detalleService.findByID(num);

        Factura factura = new Factura();

        factura.setDetalles(Arrays.asList(detalle));
        factura.setFecha(fecha);
        factura.setCamarero(cam);
        factura.setCliente(clien);

        facturaService.save(factura);

        return"redirect:/factura/lista";

    }

}
