package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.DriverDto;
import edu.aydin.insurance.Dtos.VehicleInfoDto;
import edu.aydin.insurance.Entites.Driver;
import edu.aydin.insurance.Entites.VehicleInfo;
import edu.aydin.insurance.Exceptions.VehicleInfoNotFoundException;
import edu.aydin.insurance.Repository.DriverRepository;
import edu.aydin.insurance.Repository.VehicleInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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

    public VehicleInfo addVehicleInfo(VehicleInfoDto vehicleInfoDto){
        VehicleInfo vehicleInfo = fromDto(vehicleInfoDto);
        vehicleInfoRepository.save(vehicleInfo);
        return vehicleInfo;
    }

    public List<VehicleInfoDto>  getVehicleInfosByDriverId(Long driverId){
        Optional<List<VehicleInfo>> vehicleInfos = vehicleInfoRepository.findAllByDriver(driverId);
        List<VehicleInfoDto> vehicleInfoDtoList = new ArrayList<>();
        for(VehicleInfo vehicleInfo: vehicleInfos.get())
            vehicleInfoDtoList.add(toDto(vehicleInfo));
        return vehicleInfoDtoList;
    }

    public VehicleInfo getVehicleByPlate(String plate){
        return vehicleInfoRepository.findByVehiclePlate(plate).get();
    }

    public VehicleInfoDto getVehicleInfoById(Long id){
        Optional<VehicleInfo> vehicleInfo = vehicleInfoRepository.findById(id);
        if(vehicleInfo.isPresent()){
            return toDto(vehicleInfo.get());
        }
        throw new VehicleInfoNotFoundException();

    }


    public VehicleInfoDto toDto(VehicleInfo vehicleInfo){
        List<Driver> driverList = vehicleInfo.getDriver();
        List<DriverDto> driverDtoList = new ArrayList<>();
        for(Driver driver : driverList)
            driverDtoList.add(driverService.toDto(driver));


        return new VehicleInfoDto(
                vehicleInfo.getId(),
                vehicleInfo.getVehiclePlate(),
                vehicleInfo.getVehicleBrand(),
                vehicleInfo.getVehicleModel(),
                vehicleInfo.getVehicleUsage(),
                vehicleOwnerService.getVehicleOwnerById(vehicleInfo.getVehicleOwner().getId()),
                driverDtoList
        );
    }

    public VehicleInfo fromDto(VehicleInfoDto vehicleInfoDto){

        List<DriverDto> driverDtoList = vehicleInfoDto.getDriverDto();
        List<Driver> driverList = new ArrayList<>();
        for(DriverDto driverDto : driverDtoList)
            driverList.add(driverService.fromDto(driverDto));

        VehicleInfo vehicleInfo = new VehicleInfo();
        vehicleInfo.setVehicleBrand(vehicleInfoDto.getVehicleBrand());
        vehicleInfo.setVehicleModel(vehicleInfoDto.getVehicleModel());
        vehicleInfo.setVehiclePlate(vehicleInfoDto.getVehiclePlate());
        vehicleInfo.setVehicleUsage(vehicleInfoDto.getVehicleUsage());
        vehicleInfo.setVehicleOwner(vehicleOwnerService.fromDto(vehicleInfoDto.getVehicleOwnerDto()));
        vehicleInfo.setDriver(driverList);

        return vehicleInfo;
    }
}
