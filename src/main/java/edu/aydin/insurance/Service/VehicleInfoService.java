package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.VehicleInfoDto;
import edu.aydin.insurance.Entites.VehicleInfo;
import edu.aydin.insurance.Repository.VehicleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VehicleInfoService {

    @Autowired
    private VehicleInfoRepository vehicleInfoRepository;


    public VehicleInfoDto toDto(VehicleInfo vehicleInfo){
        return new VehicleInfoDto();
    }

    public VehicleInfo fromDto(VehicleInfoDto vehicleInfoDto){
        return new VehicleInfo();
    }
}
