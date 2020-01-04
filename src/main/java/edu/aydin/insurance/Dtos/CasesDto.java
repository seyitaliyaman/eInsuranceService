package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class CasesDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long fileNo;

    @Getter
    @Setter
    private PolicyDto policyDto;

    @Getter
    @Setter
    private IncidentInfoDto incidentInfoDto;

    @Getter
    @Setter
    private ServiceDto serviceDto;

    @Getter
    @Setter
    private ExpertDto expertDto;
}
