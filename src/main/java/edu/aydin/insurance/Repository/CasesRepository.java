package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Cases;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CasesRepository extends JpaRepository<Cases,Long> {
    Optional<List<Cases>> findAllByServiceId(Long serviceId);
    Optional<Cases> findByFileNo(Long fileNo);


}
