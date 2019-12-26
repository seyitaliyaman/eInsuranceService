package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class CasesDto {

    @Getter
    @Setter
    private Long caseId;
    @Getter
    @Setter
    private Long fileNo;

    @Getter
    @Setter
    private Long policyNo;

    @Getter
    @Setter
    private Long agencyNo;

    @Getter
    @Setter
    private Date policyStartDate;

    @Getter
    @Setter
    private Date policyEndDate;

    @Getter
    @Setter
    private Long expertId;
}
