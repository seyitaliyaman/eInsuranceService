package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Driver;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DriverRepository extends JpaRepository<Driver, Long> {
}
