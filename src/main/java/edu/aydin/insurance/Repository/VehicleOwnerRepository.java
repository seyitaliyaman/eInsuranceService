package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.VehicleOwner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VehicleOwnerRepository extends JpaRepository<VehicleOwner, Long> {

    Optional<VehicleOwner> findByOwnerTC(Long ownerTc);
    Optional<VehicleOwner> findByOwnerVD(String ownerVD);
    Optional<VehicleOwner> findByOwnerVKN(Long ownerVKN);

}
