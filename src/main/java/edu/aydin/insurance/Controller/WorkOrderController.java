package edu.aydin.insurance.Controller;

import edu.aydin.insurance.Dtos.UsedPiecesDto;
import edu.aydin.insurance.Dtos.VehiclePartDto;
import edu.aydin.insurance.Dtos.WorkOrderDto;
import edu.aydin.insurance.Dtos.WorkmanshipDto;
import edu.aydin.insurance.Entites.WorkOrder;
import edu.aydin.insurance.Service.*;
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
    @Autowired
    private UsedPiecesService usedPiecesService;
    @Autowired
    private VehiclePartService vehiclePartService;

    @PostMapping(path = "/addWorkOrder/{caseId}")
    public Long addWorkOrder(@RequestBody WorkOrderDto workOrder, @PathVariable Long caseId){
        WorkOrder order = workOrderService.addWorkOrder(workOrder,caseId);
        return order.getId();
    }

    @GetMapping("/getVehicleParts")
    public List<VehiclePartDto> getVehicleParts(){
        return vehiclePartService.getAllVehicleParts();
    }

    @PostMapping(path = "/addWorkmanship/{workOrderId}")
    public void addWorkmanship(@RequestBody WorkmanshipDto workmanship, @PathVariable Long workOrderId){
        workmanshipService.addWorkmanship(workmanship,workOrderId);
    }

    @PostMapping(path = "/addWorkmanshipList/{workOrderId}")
    public void addWorkmanshipList(@RequestBody List<WorkmanshipDto> workmanships, @PathVariable Long workOrderId){
        workmanshipService.addWorkmanshipList(workmanships,workOrderId);
    }

    @PostMapping(path = "/addUsedPartList/{workOrderId}")
    public void addUsedPieces(@RequestBody List<UsedPiecesDto> usedPiecesDtos, @PathVariable Long workOrderId){

        usedPiecesService.addUsedPieces(usedPiecesDtos,workOrderId);

    }

}
