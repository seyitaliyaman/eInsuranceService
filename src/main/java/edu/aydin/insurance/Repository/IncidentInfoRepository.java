package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.IncidentInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidentInfoRepository extends JpaRepository<IncidentInfo,Long> {
}
