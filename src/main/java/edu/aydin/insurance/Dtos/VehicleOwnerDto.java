package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
public class VehicleOwnerDto {

    @Getter
    @Setter
    private Long fileNo;

    @Getter
    @Setter
    private Long tckn;

    @Getter
    @Setter
    private String vehicleOwnerName;

    @Getter
    @Setter
    private String vehicleOwnerSurname;

    @Getter
    @Setter
    private String vehicleOwnerPhone;
}
