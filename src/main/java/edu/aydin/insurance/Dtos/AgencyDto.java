package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class AgencyDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long agencyNo;

    @Getter
    @Setter
    private InsuranceCompanyDto insuranceCompanyDto;
}
