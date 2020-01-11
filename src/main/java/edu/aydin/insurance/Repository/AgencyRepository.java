package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
    Optional<Agency> findByAgencyNo(Long agencyNo);
}
