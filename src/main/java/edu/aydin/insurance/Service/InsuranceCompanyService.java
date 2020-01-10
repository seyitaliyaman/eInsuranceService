package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.InsuranceCompanyDto;
import edu.aydin.insurance.Entites.InsuranceCompany;
import edu.aydin.insurance.Exceptions.InsuranceCompanyNotFoundException;
import edu.aydin.insurance.Repository.InsuranceCompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InsuranceCompanyService {

    @Autowired
    private InsuranceCompanyRepository insuranceCompanyRepository;


    public InsuranceCompanyDto getInsuranceCompanyById(Long id){
        Optional<InsuranceCompany> insuranceCompany = insuranceCompanyRepository.findById(id);
        if(insuranceCompany.isPresent()){
            return toDto(insuranceCompany.get());
        }

        throw new InsuranceCompanyNotFoundException();
    }

    public InsuranceCompany addInsuranceCompany(InsuranceCompanyDto insuranceCompanyDto){
        InsuranceCompany insuranceCompany = fromDto(insuranceCompanyDto);
        insuranceCompanyRepository.save(insuranceCompany);
        return insuranceCompany;

    }

    public InsuranceCompany fromDto(InsuranceCompanyDto insuranceCompanyDto){
        InsuranceCompany insuranceCompany = new InsuranceCompany();
        insuranceCompany.setCompanyName(insuranceCompanyDto.getCompanyName());
        return insuranceCompany;
    }

    public InsuranceCompanyDto toDto(InsuranceCompany insuranceCompany){
        return new InsuranceCompanyDto(
                insuranceCompany.getId(),
                insuranceCompany.getCompanyName()
        );
    }
}
