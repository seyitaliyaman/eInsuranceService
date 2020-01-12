package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.WorkOrderDto;
import edu.aydin.insurance.Entites.Cases;
import edu.aydin.insurance.Entites.WorkOrder;
import edu.aydin.insurance.Exceptions.WorkOrderNotFoundException;
import edu.aydin.insurance.Repository.WorkOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkOrderService {

    @Autowired
    private WorkOrderRepository workOrderRepository;

    @Autowired
    private CasesService casesService;

    @Autowired
    private VehicleInfoService vehicleInfoService;



    public WorkOrder addWorkOrder(WorkOrderDto workOrderDto,Long caseId){
        workOrderDto.setCasesDto(casesService.getCasesById(caseId));
        Cases cases = casesService.getCasesWithId(caseId);
        WorkOrder workOrder = fromDto(workOrderDto);
        workOrder.setCases(cases);
        workOrder.setVehicleInfo(cases.getIncidentInfo().getFirstVehicle());
        workOrderRepository.save(workOrder);
        return workOrder;
    }

    public WorkOrder getByCaseId(Long caseId){
        Optional<WorkOrder> workOrder = workOrderRepository.findByCases(caseId);
        if (workOrder.isPresent()){
            return workOrder.get();
        }
        throw new WorkOrderNotFoundException();
    }

    public WorkOrderDto getWorkOrderById(Long id){
        Optional<WorkOrder> workOrder = workOrderRepository.findById(id);
        if(workOrder.isPresent()){
            return toDto(workOrder.get());
        }
        throw new WorkOrderNotFoundException();
    }

    public WorkOrder getWorkOrderWithId(Long id){
        Optional<WorkOrder> workOrder = workOrderRepository.findById(id);
        if (workOrder.isPresent()){
            return workOrder.get();
        }
        throw new WorkOrderNotFoundException();
    }

    public WorkOrderDto getWorkOrderByChassis(String chassis){
        Optional<WorkOrder> workOrder = workOrderRepository.findByVehicleChassis(chassis);
        if(workOrder.isPresent()){
            return toDto(workOrder.get());
        }
        throw new WorkOrderNotFoundException();
    }

    public WorkOrderDto getWorkOrderByMotorNumber(String motorNumber){
        Optional<WorkOrder> workOrder = workOrderRepository.findByMotorNumber(motorNumber);
        if(workOrder.isPresent()){
            return toDto(workOrder.get());
        }
        throw new WorkOrderNotFoundException();
    }


    public WorkOrder fromDto(WorkOrderDto workOrderDto){
        WorkOrder workOrder = new WorkOrder();
        workOrder.setMotorNumber(workOrderDto.getMotorNumber());
        workOrder.setVehicleChassis(workOrderDto.getVehicleChassis());
        workOrder.setVehicleKm(workOrderDto.getVehicleKm());
        workOrder.setCases(casesService.fromDto(workOrderDto.getCasesDto()));
        workOrder.setVehicleInfo(vehicleInfoService.fromDto(workOrderDto.getVehicleInfoDto()));

        return workOrder;
    }


    public WorkOrderDto toDto(WorkOrder workOrder){
        return new WorkOrderDto(
                workOrder.getId(),
                workOrder.getVehicleKm(),
                workOrder.getVehicleChassis(),
                workOrder.getMotorNumber(),
                casesService.toDto(workOrder.getCases()),
                vehicleInfoService.toDto(workOrder.getVehicleInfo())
        );
    }



}
