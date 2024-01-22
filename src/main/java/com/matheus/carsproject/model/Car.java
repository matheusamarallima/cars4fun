package com.matheus.carsproject.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private Fabricante fabricante;
    private String modelo;
    private Date ano;
    private String preco;
    private Boolean usado;


}
