package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class PolicyDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long policyNo;

    @Getter
    @Setter
    private Date policyStartDate;

    @Getter
    @Setter
    private Date policyEndDate;

    @Getter
    @Setter
    private AgencyDto agencyDto;
}
