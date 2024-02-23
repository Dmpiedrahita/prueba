package com.prueba.cocinaConCadena.controller;

import com.prueba.cocinaConCadena.dto.FacturaDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/home")
public class MenuController {

    @GetMapping("")
    public String manu(Model model){

        model.addAttribute("menu", null);

        return "menu.html";

    }


}
