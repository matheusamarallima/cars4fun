package com.matheus.carsproject.controller;

import com.matheus.carsproject.model.Car;
import com.matheus.carsproject.repository.CarRepository;
import com.matheus.carsproject.repository.FabricanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private FabricanteRepository fabricanteRepository;


    @GetMapping("/allcars")
    private ResponseEntity allCars(){
        List<Car> carList = carRepository.findAll();
        return ResponseEntity.ok(carList);
    }


}
