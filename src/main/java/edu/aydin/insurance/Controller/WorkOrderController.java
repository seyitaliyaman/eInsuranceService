package edu.aydin.insurance.Controller;

import edu.aydin.insurance.Dtos.WorkOrderDto;
import edu.aydin.insurance.Dtos.WorkmanshipDto;
import edu.aydin.insurance.Entites.WorkOrder;
import edu.aydin.insurance.Service.CasesService;
import edu.aydin.insurance.Service.VehicleInfoService;
import edu.aydin.insurance.Service.WorkOrderService;
import edu.aydin.insurance.Service.WorkmanshipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workorder")
public class WorkOrderController {

    @Autowired
    private WorkOrderService workOrderService;
    @Autowired
    private CasesService casesService;
    @Autowired
    private VehicleInfoService vehicleInfoService;
    @Autowired
    private WorkmanshipService workmanshipService;

    @PostMapping(path = "/addWorkOrder/{caseId}")
    public Long addWorkOrder(@RequestBody WorkOrderDto workOrder, @PathVariable Long caseId){
        WorkOrder order = workOrderService.addWorkOrder(workOrder,caseId);
        return order.getId();
    }

    @PostMapping(path = "/addWorkmanship/{workOrderId}")
    public void addWorkmanship(@RequestBody WorkmanshipDto workmanship, @PathVariable Long workOrderId){
        workmanshipService.addWorkmanship(workmanship,workOrderId);
    }

    @PostMapping(path = "/addWorkmanshipList/{workOrderId}")
    public void addWorkmanshipList(@RequestBody List<WorkmanshipDto> workmanships, @PathVariable Long workOrderId){
        workmanshipService.addWorkmanshipList(workmanships,workOrderId);
    }

}
