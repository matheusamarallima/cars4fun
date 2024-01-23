package com.matheus.carsproject.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JsonBackReference
    /*@JsonBackReference é ignorada durante a serialização para evitar o loop.*/
    private Fabricante fabricante;
    private String modelo;
    private Date ano;
    private String preco;
    private Boolean usado;


}
