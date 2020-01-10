package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface WorkOrderRepository extends JpaRepository<WorkOrder,Long> {

    Optional<WorkOrder> findByVehicleChassis(String chassis);
    Optional<WorkOrder> findByMotorNumber(String motorNumber);
}
