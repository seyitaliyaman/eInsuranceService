package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WorkOrderRepository extends JpaRepository<WorkOrder,Long> {
}
