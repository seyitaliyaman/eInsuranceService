package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.UsedParts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedPartsRepository extends JpaRepository<UsedParts,Long> {
}
