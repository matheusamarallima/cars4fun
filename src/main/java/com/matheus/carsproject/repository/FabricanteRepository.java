package com.matheus.carsproject.repository;

import com.matheus.carsproject.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, Long> {
    List<Fabricante> findByNome(String nome);
}
