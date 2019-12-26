package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class VehicleInfoDto {

    @Getter
    @Setter
    private Long ownerId;

    @Getter
    @Setter
    private String vehicleLicencePlate;

    @Getter
    @Setter
    private String vehicleBrand;

    @Getter
    @Setter
    private String vehicleModel;

    @Getter
    @Setter
    private String vehicleUsage;
}
