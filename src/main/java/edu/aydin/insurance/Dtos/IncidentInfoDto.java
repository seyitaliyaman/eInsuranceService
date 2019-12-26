package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class IncidentInfoDto {
    @Getter
    @Setter
    private Long fileNo;

    @Getter
    @Setter
    private String location;

    @Getter
    @Setter
    private Date incidentDate;

    @Getter
    @Setter
    private String estDamage;

    @Getter
    @Setter
    private String caseType;

    @Getter
    @Setter
    private String createDate;
}
