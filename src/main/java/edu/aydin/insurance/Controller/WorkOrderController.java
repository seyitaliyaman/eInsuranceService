package edu.aydin.insurance.Controller;

import edu.aydin.insurance.Dtos.WorkOrderDto;
import edu.aydin.insurance.Service.CasesService;
import edu.aydin.insurance.Service.VehicleInfoService;
import edu.aydin.insurance.Service.WorkOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/workorder")
public class WorkOrderController {

    @Autowired
    private WorkOrderService workOrderService;
    @Autowired
    private CasesService casesService;
    @Autowired
    private VehicleInfoService vehicleInfoService;

    @PostMapping(path = "/addWorkOrder/{caseId}")
    public void addWorkOrder(@RequestBody WorkOrderDto workOrder, @PathVariable Long caseId){
        workOrderService.addWorkOrder(workOrder,caseId);
    }

}
