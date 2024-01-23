package com.matheus.carsproject.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "fabricante_id")
    private Fabricante fabricante;
    private String modelo;
    private Date ano;
    private String preco;
    private Boolean usado;


}
