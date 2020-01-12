package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.VehiclePartDto;
import edu.aydin.insurance.Entites.VehiclePart;
import edu.aydin.insurance.Repository.VehiclePartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class VehiclePartService {

    @Autowired
    private VehiclePartRepository vehiclePartRepository;

    public VehiclePart addVehiclePart(VehiclePartDto vehiclePartDto){
        VehiclePart vehiclePart = fromDto(vehiclePartDto);
        vehiclePartRepository.save(vehiclePart);
        return vehiclePart;
    }

    public VehiclePartDto getVehiclePartById(Long id){
        Optional<VehiclePart> part = vehiclePartRepository.findById(id);
        return toDto(part.get());
    }

    public List<VehiclePartDto> getAllVehicleParts(){
        List<VehiclePart> parts = vehiclePartRepository.findAll();
        List<VehiclePartDto> partDtos = new ArrayList<>();
        for (VehiclePart part:parts){
            partDtos.add(toDto(part));
        }
        return partDtos;
    }

    public VehiclePartDto toDto(VehiclePart vehiclePart){
        return new VehiclePartDto(vehiclePart.getId(),vehiclePart.getVehiclePartName());
    }

    public VehiclePart fromDto(VehiclePartDto vehiclePartDto){
        VehiclePart vehiclePart = new VehiclePart();
        vehiclePart.setId(vehiclePartDto.getId());
        vehiclePart.setVehiclePartName(vehiclePartDto.getVehiclePartName());
        return vehiclePart;
    }

}
