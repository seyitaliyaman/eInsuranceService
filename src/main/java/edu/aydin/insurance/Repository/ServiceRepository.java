package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service,Long> {
}
