package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Cases;
import edu.aydin.insurance.Entites.WorkOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface WorkOrderRepository extends JpaRepository<WorkOrder,Long> {

    Optional<WorkOrder> findByVehicleChassis(String chassis);
    Optional<WorkOrder> findByMotorNumber(String motorNumber);
    Optional<WorkOrder> findByCases(Cases cases);
}
