package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.WorkOrder;
import edu.aydin.insurance.Entites.Workmanship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface WorkmanshipRepository extends JpaRepository<Workmanship, Long> {

    Optional<List<Workmanship>> findAllByWorkOrder(WorkOrder order);

}
