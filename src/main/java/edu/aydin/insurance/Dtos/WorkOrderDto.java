package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class WorkOrderDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long vehicleKm;

    @Getter
    @Setter
    private String vehicleChassis;

    @Getter
    @Setter
    private CasesDto casesDto;

    @Getter
    @Setter
    private VehicleInfoDto vehicleInfoDto;
}
