package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.AgencyDto;
import edu.aydin.insurance.Entites.Agency;
import edu.aydin.insurance.Exceptions.AgencyNotFoundException;
import edu.aydin.insurance.Repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AgencyService {

    @Autowired
    private AgencyRepository agencyRepository;
    @Autowired
    private InsuranceCompanyService insuranceCompanyService;

    public AgencyDto getAgencyById(Long id){
        Optional<Agency> agency = agencyRepository.findById(id);
        if(agency.isPresent()){
            return toDto(agency.get());
        }
        throw new AgencyNotFoundException();
    }

    public Agency addAgency(AgencyDto agencyDto){
        Agency agency = fromDto(agencyDto);
        agencyRepository.save(agency);

        return agency;
    }

    public Agency fromDto(AgencyDto agencyDto){

        Agency agency = new Agency();
        agency.setAgencyNo(agencyDto.getAgencyNo());
        agency.setInsuranceCompany(insuranceCompanyService.fromDto(agencyDto.getInsuranceCompanyDto()));
        return agency;
    }

    public AgencyDto toDto(Agency agency){

        return new AgencyDto(
                agency.getId(),
                agency.getAgencyNo(),
                insuranceCompanyService.toDto(agency.getInsuranceCompany())
        );

    }
}
