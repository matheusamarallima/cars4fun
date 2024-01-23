package com.matheus.carsproject.service;

import com.matheus.carsproject.model.Fabricante;
import com.matheus.carsproject.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FabricanteService {

    @Autowired
    FabricanteRepository fabricanteRepository;


    public List<Fabricante> getAll(){
        return fabricanteRepository.findAll();
    }

    public List<Fabricante> getByNome(String nome){
        return fabricanteRepository.findByNome(nome);
    }

}
