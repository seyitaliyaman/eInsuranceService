package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.IncidentInfoDto;
import edu.aydin.insurance.Entites.IncidentInfo;
import edu.aydin.insurance.Entites.VehicleInfo;
import edu.aydin.insurance.Repository.IncidentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IncidentInfoService {

    @Autowired
    private IncidentInfoRepository incidentInfoRepository;

    @Autowired
    private VehicleInfoService vehicleInfoService;


    public IncidentInfo fromDto(IncidentInfoDto incidentInfoDto){
        IncidentInfo incidentInfo = new IncidentInfo();
        incidentInfo.setIncidentCaseType(incidentInfoDto.getIncidentCaseType());
        incidentInfo.setIncidentDate(incidentInfoDto.getIncidentDate());
        incidentInfo.setIncidentEstDamage(incidentInfoDto.getIncidentEstDamage());
        incidentInfo.setIncidentLocation(incidentInfoDto.getIncidentLocation());
        incidentInfo.setFirstVehicle(vehicleInfoService.fromDto(incidentInfoDto.getFirstVehicle()));
        incidentInfo.setSecondVehicle(vehicleInfoService.fromDto(incidentInfoDto.getSecondVehicle()));

        return incidentInfo;
    }

    public IncidentInfoDto toDto(IncidentInfo incidentInfo){
        return new IncidentInfoDto(
                incidentInfo.getId(),
                incidentInfo.getIncidentLocation(),
                incidentInfo.getIncidentDate(),
                incidentInfo.getIncidentEstDamage(),
                incidentInfo.getIncidentCaseType(),
                vehicleInfoService.toDto(incidentInfo.getFirstVehicle()),
                vehicleInfoService.toDto(incidentInfo.getSecondVehicle())
        );
    }
}
