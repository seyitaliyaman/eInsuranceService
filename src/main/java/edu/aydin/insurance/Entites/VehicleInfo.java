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
import java.util.List;


@Entity
@Table(name = "vehicle_info")
@NoArgsConstructor
public class VehicleInfo {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "vehicleinfo-sequence-generator")
    @GenericGenerator(
            name = "vehicleinfo-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "vehicleinfo_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "vehicle_plate")
    private String vehiclePlate;

    @Getter
    @Setter
    @Column(name = "vehicle_brand")
    private String vehicleBrand;

    @Getter
    @Setter
    @Column(name = "vehicle_model")
    private String vehicleModel;

    @Getter
    @Setter
    @Column(name = "vehicle_usage")
    private String vehicleUsage;

    @Getter
    @Setter
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private VehicleOwner vehicleOwner;

    @Getter
    @Setter
    @ManyToMany
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Driver> driver;

}
