package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "incident_info")
@NoArgsConstructor
public class IncidentInfo {

    @Getter
    @Setter
    @Column(name = "file_no")
    private Long fileNo;

    @Getter
    @Setter
    @Column(name = "location")
    private String location;

    @Getter
    @Setter
    @Column(name = "incident_date")
    private Date incidentDate;

    @Getter
    @Setter
    @Column(name = "est_damage")
    private String estDamage;

    @Getter
    @Setter
    @Column(name = "case_type")
    private String caseType;

    @Getter
    @Setter
    @Column(name = "create_date")
    private String createDate;
}
