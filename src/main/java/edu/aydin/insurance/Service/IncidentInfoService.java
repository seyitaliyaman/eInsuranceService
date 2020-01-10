package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.DriverDto;
import edu.aydin.insurance.Dtos.IncidentInfoDto;
import edu.aydin.insurance.Entites.Driver;
import edu.aydin.insurance.Entites.IncidentInfo;
import edu.aydin.insurance.Entites.VehicleInfo;
import edu.aydin.insurance.Exceptions.IncidentInfoNotFoundException;
import edu.aydin.insurance.Repository.IncidentInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IncidentInfoService {

    @Autowired
    private IncidentInfoRepository incidentInfoRepository;

    @Autowired
    private VehicleInfoService vehicleInfoService;



    public IncidentInfoDto getIncidentInfoById(Long id){

        Optional<IncidentInfo> incidentInfo = incidentInfoRepository.findById(id);

        if(incidentInfo.isPresent()){
            return toDto(incidentInfo.get());
        }
        throw new IncidentInfoNotFoundException();
    }

    public IncidentInfo addIncidentInfo(IncidentInfoDto incidentInfoDto){
        IncidentInfo incidentInfo = fromDto(incidentInfoDto);
        incidentInfoRepository.save(incidentInfo);

        return incidentInfo;
    }


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
