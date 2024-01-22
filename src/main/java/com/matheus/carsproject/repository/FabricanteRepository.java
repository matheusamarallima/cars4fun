package com.matheus.carsproject.repository;

import com.matheus.carsproject.model.Fabricante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface FabricanteRepository extends JpaRepository<Fabricante, UUID> {
}
