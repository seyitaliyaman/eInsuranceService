package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Cases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasesRepository extends JpaRepository<Cases,Long> {
}
