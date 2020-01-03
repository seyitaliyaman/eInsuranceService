package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "vehicle_part")
@NoArgsConstructor
public class VehiclePart {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "vehiclepart-sequence-generator")
    @GenericGenerator(
            name = "vehiclepart-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "vehiclepart_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "vehicle_part_name")
    private String vehiclePartName;

}
