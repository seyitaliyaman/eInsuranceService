package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.ServiceInc;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ServiceIncRepository extends JpaRepository<ServiceInc, Long> {

    Optional<ServiceInc> findByVKN(Long vkn);

}
