package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.AgencyDto;
import edu.aydin.insurance.Entites.Agency;
import edu.aydin.insurance.Repository.AgencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AgencyService {

    @Autowired
    private AgencyRepository agencyRepository;


    public Agency fromDto(AgencyDto agencyDto){
        return null;
    }

    public AgencyDto toDto(Agency agency){
        return null;
    }
}
