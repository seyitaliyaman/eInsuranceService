package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.ServiceIncDto;
import edu.aydin.insurance.Entites.ServiceInc;
import edu.aydin.insurance.Exceptions.ServiceIncNotFoundException;
import edu.aydin.insurance.Repository.ServiceIncRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceIncService {

    @Autowired
    private ServiceIncRepository serviceIncRepository;

    public ServiceIncDto getServiceIncByVKN(Long vkn){
        Optional<ServiceInc> serviceInc = serviceIncRepository.findByVKN(vkn);
        if(serviceInc.isPresent()){
            return toDto(serviceInc.get());
        }
        throw new ServiceIncNotFoundException();
    }

    public ServiceIncDto getServiceById(Long id){
        Optional<ServiceInc> serviceInc = serviceIncRepository.findById(id);
        if(serviceInc.isPresent()){
            return toDto(serviceInc.get());
        }
        throw new ServiceIncNotFoundException();
    }

    public ServiceInc getService(Long id){
        Optional<ServiceInc> serviceInc = serviceIncRepository.findById(id);
        if(serviceInc.isPresent()){
            return serviceInc.get();
        }
        throw new ServiceIncNotFoundException();
    }


    public ServiceInc fromDto(ServiceIncDto serviceIncDto){
        ServiceInc serviceInc = new ServiceInc();
        serviceInc.setServiceAddress(serviceIncDto.getServiceAddress());
        serviceInc.setServiceEmail(serviceIncDto.getServiceEmail());
        serviceInc.setServiceName(serviceIncDto.getServiceName());
        serviceInc.setServicePhone(serviceIncDto.getServicePhone());
        serviceInc.setVD(serviceIncDto.getVD());
        serviceInc.setVKN(serviceIncDto.getVKN());

        return serviceInc;
    }


    public ServiceIncDto toDto(ServiceInc serviceInc){
        return new ServiceIncDto(
                serviceInc.getId(),
                serviceInc.getServiceName(),
                serviceInc.getServicePhone(),
                serviceInc.getVKN(),
                serviceInc.getVD(),
                serviceInc.getServiceAddress(),
                serviceInc.getServiceEmail()
        );
    }





}
