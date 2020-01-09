package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.ExpertDto;
import edu.aydin.insurance.Entites.Expert;
import edu.aydin.insurance.Exceptions.ExpertNotFoundException;
import edu.aydin.insurance.Repository.ExpertRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ExpertService {

    @Autowired
    private ExpertRepository expertRepository;

    public ExpertDto getExpertById(Long id){
        Optional<Expert> expert = expertRepository.findById(id);
        if(expert.isPresent()){
            return toDto(expert.get());
        }
        throw new ExpertNotFoundException();
    }

    public Expert addExpert(ExpertDto expertDto){
        Expert expert = fromDto(expertDto);
        expertRepository.save(expert);
        return expert;
    }


    public Expert fromDto(ExpertDto expertDto){
        Expert expert = new Expert();
        expert.setExpertName(expertDto.getExpertName());
        expert.setExpertSurname(expertDto.getExpertSurname());
        expert.setExpertPhone(expertDto.getExpertPhone());

        return expert;
    }

    public ExpertDto toDto(Expert expert){
        return new ExpertDto(
                expert.getId(),
                expert.getExpertName(),
                expert.getExpertSurname(),
                expert.getExpertPhone()
        );
    }
}
