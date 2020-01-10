package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.CasesDto;
import edu.aydin.insurance.Entites.Cases;
import edu.aydin.insurance.Exceptions.CasesListNotFoundException;
import edu.aydin.insurance.Exceptions.CasesNotFoundException;
import edu.aydin.insurance.Repository.CasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CasesService {

    @Autowired
    private CasesRepository casesRepository;

    @Autowired
    private PolicyService policyService;

    @Autowired
    private IncidentInfoService incidentInfoService;

    @Autowired
    private ServiceIncService serviceIncService;

    @Autowired
    private ExpertService expertService;


    public List<CasesDto> getAllCasesByServiceId(Long serviceId){
        Optional<List<Cases>> casesList = casesRepository.findAllByServiceId(serviceId);

        if(casesList.isPresent()){
            List<CasesDto> casesDtos = new ArrayList<>();
            for(Cases cases : casesList.get())
                casesDtos.add(toDto(cases));
            return casesDtos;
        }

        throw new CasesListNotFoundException();

    }

    public CasesDto getCasesByFileNo(Long fileNo){
        Optional<Cases> cases = casesRepository.findByFileNo(fileNo);
        if(cases.isPresent()){
            return toDto(cases.get());
        }
        throw new CasesNotFoundException();
    }

    public CasesDto getCasesById(Long id){
        Optional<Cases> cases = casesRepository.findById(id);
        if(cases.isPresent()){
            return toDto(cases.get());
        }
        throw new CasesNotFoundException();
    }


    public Cases addCases(CasesDto casesDto){
        Cases cases = fromDto(casesDto);
        casesRepository.save(cases);

        return cases;
    }


    public CasesDto toDto(Cases cases){
        return new CasesDto(
                cases.getId(),
                cases.getFileNo(),
                cases.getCreateDate(),
                policyService.toDto(cases.getPolicy()),
                incidentInfoService.toDto(cases.getIncidentInfo()),
                serviceIncService.toDto(cases.getService()),
                expertService.toDto(cases.getExpert())
        );
    }

    public Cases fromDto(CasesDto casesDto){
        Cases cases = new Cases();
        cases.setFileNo(casesDto.getFileNo());
        cases.setCreateDate(casesDto.getCreateDate());
        cases.setPolicy(policyService.fromDto(casesDto.getPolicyDto()));
        cases.setIncidentInfo(incidentInfoService.fromDto(casesDto.getIncidentInfoDto()));
        cases.setService(serviceIncService.fromDto(casesDto.getServiceDto()));
        cases.setExpert(expertService.fromDto(casesDto.getExpertDto()));

        return cases;
    }
}
