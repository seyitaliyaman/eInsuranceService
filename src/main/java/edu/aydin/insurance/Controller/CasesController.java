package edu.aydin.insurance.Controller;

import edu.aydin.insurance.Dtos.*;
import edu.aydin.insurance.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cases")
public class CasesController {

    @Autowired
    private CasesService casesService;
    @Autowired
    private ServiceIncService serviceIncService;
    @Autowired
    private ExpertService expertService;
    @Autowired
    private PolicyService policyService;
    @Autowired
    private AgencyService agencyService;
    @Autowired
    private InsuranceCompanyService insuranceCompanyService;
    @Autowired
    private VehicleInfoService vehicleInfoService;
    @Autowired
    private VehicleOwnerService vehicleOwnerService;
    @Autowired
    private DriverService driverService;


    @PostMapping(path = "/vehicleinfo")
    public void addVehicleInfo(@RequestBody VehicleInfoDto vehicleInfoDto){
        vehicleInfoService.addVehicleInfo(vehicleInfoDto);
    }

    @PostMapping(path = "/vehicleowner")
    public void addVehicleOwner(@RequestBody VehicleOwnerDto vehicleOwnerDto){
        vehicleOwnerService.addVehicleOwner(vehicleOwnerDto);
    }

    @PostMapping(path = "/driver")
    public void addDriver(@RequestBody DriverDto driverDto){
        driverService.addDriver(driverDto);
    }

    @PostMapping(path = "/inscomp")
    public void addInsuranceCompany(@RequestBody InsuranceCompanyDto insuranceCompanyDto){
        insuranceCompanyService.addInsuranceCompany(insuranceCompanyDto);
    }

    @PostMapping(path = "/agency")
    public void addAgency(@RequestBody AgencyDto agencyDto){
        agencyService.addAgency(agencyDto);
    }

    @PostMapping(path = "/policy")
    public void addPolicy(@RequestBody PolicyDto policyDto){
        policyService.addPolicy(policyDto);
    }

    @PostMapping(path = "/expert")
    public void addExpert(@RequestBody ExpertDto expertDto){
        expertService.addExpert(expertDto);
    }

    @PostMapping(path = "/case")
    public void addCases(@RequestBody CasesDto casesDto){
        casesService.addCases(casesDto);
    }

}
