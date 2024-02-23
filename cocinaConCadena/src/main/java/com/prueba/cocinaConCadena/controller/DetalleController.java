package com.prueba.cocinaConCadena.controller;


import com.prueba.cocinaConCadena.dto.DetalleDTO;
import com.prueba.cocinaConCadena.dto.FacturaDTO;
import com.prueba.cocinaConCadena.service.DetalleService;
import com.prueba.cocinaConCadena.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/detalles")
public class DetalleController {

//    @Autowired
//    private DetalleService detalleService;
//
//    @GetMapping("/lista")
//    public String listaDetalles(Model model){
//
//        List<DetalleDTO> listaDetalles = detalleService.listaDetalles();
//
//        model.addAttribute("detalles", listaDetalles);
//
//        return "detalles.html";
//
//    }
}
