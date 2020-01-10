package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.WorkmanshipPartDto;
import edu.aydin.insurance.Entites.WorkmanshipPart;
import edu.aydin.insurance.Repository.WorkmanshipPartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WorkmanshipPartService {

    @Autowired
    private WorkmanshipPartRepository workmanshipPartRepository;

    public WorkmanshipPart addWorkmanshipPart(WorkmanshipPartDto workmanshipPartDto){
        WorkmanshipPart workmanshipPart = fromDto(workmanshipPartDto);
        workmanshipPartRepository.save(workmanshipPart);
        return workmanshipPart;
    }

    public WorkmanshipPartDto getWorkmanshipPartById(Long id){
        Optional<WorkmanshipPart> part = workmanshipPartRepository.findById(id);
        return toDto(part.get());
    }

    public WorkmanshipPartDto toDto(WorkmanshipPart workmanshipPart){
        return new WorkmanshipPartDto(workmanshipPart.getId(),workmanshipPart.getPartName());
    }

    public WorkmanshipPart fromDto(WorkmanshipPartDto workmanshipPartDto){
        WorkmanshipPart workmanshipPart = new WorkmanshipPart();
        workmanshipPart.setId(workmanshipPartDto.getId());
        workmanshipPart.setPartName(workmanshipPartDto.getPartName());
        return workmanshipPart;
    }

}
