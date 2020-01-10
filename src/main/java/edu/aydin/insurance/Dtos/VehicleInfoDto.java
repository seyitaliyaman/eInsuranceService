package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class VehicleInfoDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String vehiclePlate;

    @Getter
    @Setter
    private String vehicleBrand;

    @Getter
    @Setter
    private String vehicleModel;

    @Getter
    @Setter
    private String vehicleUsage;

    @Getter
    @Setter
    private VehicleOwnerDto vehicleOwnerDto;

    @Getter
    @Setter
    private List<DriverDto> driverDto;
}
