package com.enrique.crud.backend.mappers;

import com.enrique.crud.backend.dtos.VehiculoDTO;
import com.enrique.crud.backend.entities.Vehiculo;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface VehiculoMapper {
    Vehiculo aVehiculo(VehiculoDTO vehiculoDTO);

    VehiculoDTO aVehiculoDTO(Vehiculo vehiculo);

    List<VehiculoDTO> aVehiculosDTO(List<Vehiculo> vehiculoLista);

    List<Vehiculo> aVehiculos(List<VehiculoDTO> vehiculosDTOLista);
}
