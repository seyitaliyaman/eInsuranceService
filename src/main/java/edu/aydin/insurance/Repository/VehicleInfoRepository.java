package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.VehicleInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VehicleInfoRepository extends JpaRepository<VehicleInfo, Long> {

    Optional<List<VehicleInfo>> findAllByDriver(Long id);
    Optional<VehicleInfo> findByVehiclePlate(String plate);
}
