package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.DriverDto;
import edu.aydin.insurance.Entites.Driver;
import edu.aydin.insurance.Exceptions.DriverNotFoundException;
import edu.aydin.insurance.Repository.DriverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DriverService {

    @Autowired
    private DriverRepository driverRepository;

    public DriverDto getDriverByTCKN(String tckn){

        Optional<Driver> driver = driverRepository.findByDriverTC(tckn);

        if(driver.isPresent()){
            return toDto(driver.get());
        }
        throw new DriverNotFoundException();
    }

    public DriverDto getDriverById(Long id){
        Optional<Driver> driver = driverRepository.findById(id);

        if(driver.isPresent()){
            return toDto(driver.get());
        }
        throw new DriverNotFoundException();

    }

    public Driver addDriver(DriverDto driverDto){
        Driver driver = fromDto(driverDto);
        driverRepository.save(driver);
        return driver;
    }


    public Driver fromDto(DriverDto driverDto){
        Driver driver = new Driver();
        driver.setDriverName(driverDto.getDriverName());
        driver.setDriverSurname(driverDto.getDriverSurname());
        driver.setDriverTC(driverDto.getDriverTC());
        driver.setDriverPhone(driverDto.getDriverPhone());
        return driver;
    }


    public DriverDto toDto(Driver driver){
        return new DriverDto(
                driver.getId(),
                driver.getDriverTC(),
                driver.getDriverName(),
                driver.getDriverSurname(),
                driver.getDriverPhone()
        );
    }
}
