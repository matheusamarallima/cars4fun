package com.matheus.carsproject.service;

import com.matheus.carsproject.model.Car;
import com.matheus.carsproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarsService {

    @Autowired
    private CarRepository carRepository;


    public List<Car> getAllCars(){
        return carRepository.findAll();
    }

    public List<Car> getAllCarsByName(String modelo){
        return carRepository.findByModelo(modelo);
    }
}
