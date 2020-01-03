package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.VehicleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehicleInfoRepository extends JpaRepository<VehicleInfo, Long> {
}
