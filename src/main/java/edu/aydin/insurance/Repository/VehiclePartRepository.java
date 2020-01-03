package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.VehiclePart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiclePartRepository extends JpaRepository<VehiclePart, Long> {
}
