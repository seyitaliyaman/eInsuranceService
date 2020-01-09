package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Dtos.DriverDto;
import edu.aydin.insurance.Entites.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DriverRepository extends JpaRepository<Driver, Long> {
    Optional<Driver> findByDriverTC(String tckn);
}
