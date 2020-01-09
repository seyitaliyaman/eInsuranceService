package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceRepository extends JpaRepository<Service, Long> {

    Optional<Service> findById(Long id);
}
