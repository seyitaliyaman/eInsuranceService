package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner, Long> {
}
