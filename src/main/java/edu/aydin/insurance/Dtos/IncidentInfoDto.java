package edu.aydin.insurance.Dtos;

import edu.aydin.insurance.Entites.VehicleInfo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class IncidentInfoDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String incidentLocation;

    @Getter
    @Setter
    private Date incidentDate;

    @Getter
    @Setter
    private Long incidentEstDamage;

    @Getter
    @Setter
    private String incidentCaseType;

    @Getter
    @Setter
    private VehicleInfoDto firstVehicle;

    @Getter
    @Setter
    private VehicleInfoDto secondVehicle;
}
