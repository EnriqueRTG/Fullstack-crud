package com.enrique.crud.backend.repositories;

import com.enrique.crud.backend.entities.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {
}
