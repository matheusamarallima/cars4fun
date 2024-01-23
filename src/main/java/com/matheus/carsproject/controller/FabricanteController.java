package com.matheus.carsproject.controller;

import com.matheus.carsproject.model.Fabricante;
import com.matheus.carsproject.service.FabricanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/fabricantes")
public class FabricanteController {

    @Autowired
    FabricanteService fabricanteService;

    @GetMapping("/all")
    public List<Fabricante> getAll(){
        return fabricanteService.getAll();
    }

    @GetMapping("/nome/{nome}")
    public List<Fabricante> getFabricanteByName(@PathVariable String nome){
        return fabricanteService.getByNome(nome);
    }
}
