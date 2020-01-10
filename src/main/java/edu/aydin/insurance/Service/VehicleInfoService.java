package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.VehicleInfoDto;
import edu.aydin.insurance.Entites.VehicleInfo;
import edu.aydin.insurance.Exceptions.VehicleInfoNotFoundException;
import edu.aydin.insurance.Repository.DriverRepository;
import edu.aydin.insurance.Repository.VehicleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleInfoService {

    @Autowired
    private VehicleInfoRepository vehicleInfoRepository;

    @Autowired
    private VehicleOwnerService vehicleOwnerService;


    @Autowired
    private DriverService driverService;

    @Autowired
    private DriverRepository driverRepository;


    public VehicleInfoDto getVehicleInfoById(Long id){
        Optional<VehicleInfo> vehicleInfo = vehicleInfoRepository.findById(id);
        if(vehicleInfo.isPresent()){
            return toDto(vehicleInfo.get());
        }
        throw new VehicleInfoNotFoundException();

    }


    public VehicleInfoDto toDto(VehicleInfo vehicleInfo){

        return new VehicleInfoDto(
                vehicleInfo.getId(),
                vehicleInfo.getVehiclePlate(),
                vehicleInfo.getVehicleBrand(),
                vehicleInfo.getVehicleModel(),
                vehicleInfo.getVehicleUsage(),
                vehicleOwnerService.getVehicleOwnerById(vehicleInfo.getVehicleOwner().getId()),
                null

        );
    }

    public VehicleInfo fromDto(VehicleInfoDto vehicleInfoDto){

        VehicleInfo vehicleInfo = new VehicleInfo();
        vehicleInfo.setVehicleBrand(vehicleInfoDto.getVehicleBrand());
        vehicleInfo.setVehicleModel(vehicleInfoDto.getVehicleModel());
        vehicleInfo.setVehiclePlate(vehicleInfoDto.getVehiclePlate());
        vehicleInfo.setVehicleUsage(vehicleInfo.getVehicleUsage());
        vehicleInfo.setVehicleOwner(vehicleOwnerService.fromDto(vehicleInfoDto.getVehicleOwnerDto()));
        vehicleInfo.setDriver(null);

        return vehicleInfo;
    }
}
