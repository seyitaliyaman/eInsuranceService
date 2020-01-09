package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.VehicleOwnerDto;
import edu.aydin.insurance.Entites.VehicleOwner;
import edu.aydin.insurance.Exceptions.VehicleOwnerNotFoundException;
import edu.aydin.insurance.Repository.VehicleOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class VehicleOwnerService {

    @Autowired
    private VehicleOwnerRepository vehicleOwnerRepository;

    public VehicleOwnerDto getVehicleOwnerByTC(Long tc){

        Optional<VehicleOwner> vehicleOwner = vehicleOwnerRepository.findByOwnerTC(tc);
        if(vehicleOwner.isPresent()){
            return toDto(vehicleOwner.get());
        }
        throw new VehicleOwnerNotFoundException();

    }

    public VehicleOwnerDto getVehicleOwnerByVKN(Long vkn){

        Optional<VehicleOwner> vehicleOwner = vehicleOwnerRepository.findByOwnerVKN(vkn);
        if(vehicleOwner.isPresent()){
            return toDto(vehicleOwner.get());
        }
        throw new VehicleOwnerNotFoundException();

    }

    public VehicleOwnerDto getVehicleOwnerById(Long id){

        Optional<VehicleOwner> vehicleOwner = vehicleOwnerRepository.findById(id);
        if(vehicleOwner.isPresent()){
            return toDto(vehicleOwner.get());
        }
        throw new VehicleOwnerNotFoundException();

    }

    public VehicleOwner addVehicleOwner(VehicleOwnerDto vehicleOwnerDto){
        VehicleOwner vehicleOwner = fromDto(vehicleOwnerDto);
        vehicleOwnerRepository.save(vehicleOwner);
        return vehicleOwner;
    }


    public VehicleOwner fromDto(VehicleOwnerDto vehicleOwnerDto){
        VehicleOwner vehicleOwner = new VehicleOwner();
        vehicleOwner.setOwnerName(vehicleOwnerDto.getOwnerName());
        vehicleOwner.setOwnerSurname(vehicleOwnerDto.getOwnerSurname());
        vehicleOwner.setOwnerTC(vehicleOwnerDto.getOwnerTC());
        vehicleOwner.setOwnerVD(vehicleOwnerDto.getOwnerVD());
        vehicleOwner.setOwnerVKN(vehicleOwnerDto.getOwnerVKN());
        vehicleOwner.setOwnerPhone(vehicleOwnerDto.getOwnerPhone());
        vehicleOwner.setOwnerAddress(vehicleOwnerDto.getOwnerAddress());

        return vehicleOwner;
    }


    public VehicleOwnerDto toDto(VehicleOwner vehicleOwner){
        return new VehicleOwnerDto(
                vehicleOwner.getId(),
                vehicleOwner.getOwnerTC(),
                vehicleOwner.getOwnerVKN(),
                vehicleOwner.getOwnerVD(),
                vehicleOwner.getOwnerName(),
                vehicleOwner.getOwnerSurname(),
                vehicleOwner.getOwnerPhone(),
                vehicleOwner.getOwnerAddress()
        );
    }
}
