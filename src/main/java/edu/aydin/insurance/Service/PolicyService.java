package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.PolicyDto;
import edu.aydin.insurance.Entites.Policy;
import edu.aydin.insurance.Repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    @Autowired
    private AgencyService agencyService;

    public Policy addPolicy(PolicyDto policyDto){
        Policy policy = fromDto(policyDto);
        policyRepository.save(policy);
        return policy;
    }


    public Policy fromDto(PolicyDto policyDto){
        Policy policy = new Policy();
        policy.setPolicyNo(policyDto.getPolicyNo());
        policy.setPolicyStartDate(policyDto.getPolicyStartDate());
        policy.setPolicyEndDate(policyDto.getPolicyEndDate());
        policy.setAgency(agencyService.fromDto(policyDto.getAgencyDto()));

        return policy;
    }

    public PolicyDto toDto(Policy policy){

        return new PolicyDto(
                policy.getId(),
                policy.getPolicyNo(),
                policy.getPolicyStartDate(),
                policy.getPolicyEndDate(),
                agencyService.toDto(policy.getAgency())
        );
    }
}
