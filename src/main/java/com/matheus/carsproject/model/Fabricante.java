package com.matheus.carsproject.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Fabricante {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @JsonManagedReference
    /* @JsonManagedReference é considerada a "gerenciadora" da relação e é serializada normalmente.*/
    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL)
    private List<Car> carList;
}
