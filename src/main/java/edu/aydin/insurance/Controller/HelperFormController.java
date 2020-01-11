package edu.aydin.insurance.Controller;

import edu.aydin.insurance.Dtos.*;
import edu.aydin.insurance.Service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/helper")
public class HelperFormController {

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

    @PostMapping(path = "/add/case")
    public void addCases(@RequestBody CasesDto casesDto, @RequestHeader("ServiceId") Long serviceId){
        casesService.addCases(casesDto,serviceId);
    }


    @PostMapping(path = "/delete/case/{id}")
    public void deleteCaseById(@PathVariable Long id){
        casesService.deleteCaseById(id);
    }


/** Buralar şu an kullanılmayacak**/
    @PostMapping(path = "/add/vehicleinfo")
    public void addVehicleInfo(@RequestBody VehicleInfoDto vehicleInfoDto){
        vehicleInfoService.addVehicleInfo(vehicleInfoDto);
    }

    @PostMapping(path = "/add/vehicleowner")
    public void addVehicleOwner(@RequestBody VehicleOwnerDto vehicleOwnerDto){
        vehicleOwnerService.addVehicleOwner(vehicleOwnerDto);
    }

    @PostMapping(path = "/add/driver")
    public void addDriver(@RequestBody DriverDto driverDto){
        driverService.addDriver(driverDto);
    }

    @PostMapping(path = "/add/inscomp")
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



}
