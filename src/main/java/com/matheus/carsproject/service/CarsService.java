package com.matheus.carsproject.service;

import com.matheus.carsproject.model.Car;
import com.matheus.carsproject.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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

    public List<Car> getByStartingPrice(BigDecimal price) {
        List<Car> allCars = carRepository.findAll();

        return allCars.stream()
                .filter(car -> car.getPreco().compareTo(price) >= 0)
                .toList();
    }

    public List<Car> getByPriceLess(BigDecimal price) {
        List<Car> allCars = carRepository.findAll();
        return allCars.stream()
                .filter(car -> car.getPreco().compareTo(price) <= 0)
                .toList();
    }
}
