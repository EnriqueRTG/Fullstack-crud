package com.enrique.crud.backend.controllers;

import com.enrique.crud.backend.dtos.VehiculoDTO;
import com.enrique.crud.backend.services.VehiculoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class VehiculoController {

    @Autowired
    private final VehiculoService vehiculoService;

    @GetMapping("/vehiculos")
    public ResponseEntity<List<VehiculoDTO>> traerVehiculos() {
        return ResponseEntity.ok(vehiculoService.traerVehiculos());
    }

    @GetMapping("/vehiculos/{id}")
    public ResponseEntity<VehiculoDTO> traerVehiculo(@PathVariable Long id) {
        return ResponseEntity.ok(vehiculoService.traerVehiculo(id));
    }

    @PostMapping("/vehiculos")
    public ResponseEntity<VehiculoDTO> crearVehiculo(@Valid @RequestBody VehiculoDTO vehiculoDTO) {
        VehiculoDTO VehiculoDTOCreado = vehiculoService.crearVehiculo(vehiculoDTO);
        return ResponseEntity.created(URI.create("/vehiculos/" + VehiculoDTOCreado.getId())).body(VehiculoDTOCreado);
    }
}
