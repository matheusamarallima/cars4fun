package com.matheus.carsproject.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Getter
@Setter
public class Fabricante {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @JsonManagedReference
    /* @JsonManagedReference é considerada a "gerenciadora" da relação e é serializada normalmente.*/
    @OneToMany(mappedBy = "fabricante", cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Car> carList;

    @Override
    public String toString() {
        return "Fabricante{id=" + id + ", nome='" + nome + "'}";
    }
}
