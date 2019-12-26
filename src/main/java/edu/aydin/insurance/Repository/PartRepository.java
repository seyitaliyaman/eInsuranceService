package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Part;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartRepository extends JpaRepository<Part,Long> {
}
