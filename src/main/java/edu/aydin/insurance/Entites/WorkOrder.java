package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "work_order")
@NoArgsConstructor
public class WorkOrder {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "workorder-sequence-generator")
    @GenericGenerator(
            name = "workorder-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "workorder_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "vehicle_km")
    private Long vehicleKm;

    @Getter
    @Setter
    @Column(name = "vehicle_chassis")
    private String vehicleChassis;

    @Getter
    @Setter
    @OneToOne
    private Cases cases;

    @Getter
    @Setter
    @OneToOne
    private VehicleInfo vehicleInfo;


}
