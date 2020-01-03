package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Agency;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgencyRepository extends JpaRepository<Agency, Long> {
}
