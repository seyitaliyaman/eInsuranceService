package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "incident_info")
@NoArgsConstructor
public class IncidentInfo {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "incidentinfo-sequence-generator")
    @GenericGenerator(
            name = "incidentinfo-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "incidentinfo_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "incident_location")
    private String incidentLocation;

    @Getter
    @Setter
    @Column(name = "incident_date")
    private Date incidentDate;

    @Getter
    @Setter
    @Column(name = "incident_est_damage")
    private Long incidentEstDamage;

    @Getter
    @Setter
    @Column(name = "incident_case_type")
    private String incidentCaseType;


    @Getter
    @Setter
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private VehicleInfo firstVehicle;

    @Getter
    @Setter
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private VehicleInfo secondVehicle;
}
