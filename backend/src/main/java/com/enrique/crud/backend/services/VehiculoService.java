package com.enrique.crud.backend.services;

import com.enrique.crud.backend.dtos.VehiculoDTO;
import com.enrique.crud.backend.entities.Vehiculo;
import com.enrique.crud.backend.exceptions.AppException;
import com.enrique.crud.backend.mappers.VehiculoMapper;
import com.enrique.crud.backend.repositories.VehiculoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculoService {
    @Autowired
    private final VehiculoRepository vehiculoRepository;
    @Autowired
    private final VehiculoMapper vehiculoMapper;

    public List<VehiculoDTO> traerVehiculos() {
        List<Vehiculo> listaVehiculos = vehiculoRepository.findAll();
        return vehiculoMapper.aVehiculosDTO(listaVehiculos);
    }

    public VehiculoDTO traerVehiculo(Long id) {
        Vehiculo vehiculo = vehiculoRepository.findById(id)
                .orElseThrow(() -> new AppException("Vehiculo no encontrado", HttpStatus.NOT_FOUND));
        return vehiculoMapper.aVehiculoDTO(vehiculo);
    }

    public VehiculoDTO crearVehiculo(VehiculoDTO vehiculoDTO) {
        Vehiculo vehiculo = vehiculoMapper.aVehiculo(vehiculoDTO);
        Vehiculo vehiculoCreado = vehiculoRepository.save(vehiculo);
        return vehiculoMapper.aVehiculoDTO(vehiculoCreado);
    }
}
