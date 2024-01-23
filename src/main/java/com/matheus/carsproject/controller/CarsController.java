package com.matheus.carsproject.controller;

import com.matheus.carsproject.model.Car;
import com.matheus.carsproject.service.CarsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarsService carsService;


    @GetMapping("/allcars")
    private ResponseEntity<List<Car>> allCars(){
        return ResponseEntity.ok(carsService.getAllCars());
    }

    @GetMapping("modelo/{modelo}")
    private ResponseEntity<List<Car>> getByModelo(@PathVariable String modelo){
        return ResponseEntity.ok(carsService.getAllCarsByName(modelo));
    }

    @GetMapping("/price/start/{price}")
    private ResponseEntity<List<Car>> getPriceStart(@PathVariable BigDecimal price){
        return ResponseEntity.ok(carsService.getByStartingPrice(price));
    }

    @GetMapping("/price/less/{price}")
    private ResponseEntity<List<Car>> getPriceLess(@PathVariable BigDecimal price){
        return ResponseEntity.ok(carsService.getByPriceLess(price));
    }

}
