package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<Expert,Long> {
}
