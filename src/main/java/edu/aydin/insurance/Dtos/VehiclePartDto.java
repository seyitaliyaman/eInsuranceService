package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class VehiclePartDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String vehiclePartName;
}
