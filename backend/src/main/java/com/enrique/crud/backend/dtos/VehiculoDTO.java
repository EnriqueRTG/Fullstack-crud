package com.enrique.crud.backend.dtos;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Getter
@Setter
public class VehiculoDTO {

    private Long id;
    @NotNull
    private String marca;
    @NotNull
    private String modelo;
    @NotNull
    private String color;

    private int anio;

}
