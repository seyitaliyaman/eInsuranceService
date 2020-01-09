package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "vehicle_owner")
@NoArgsConstructor
public class VehicleOwner {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "vehicleowner-sequence-generator")
    @GenericGenerator(
            name = "vehicleowner-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "vehicleowner_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "owner_tc",unique = true)
    private Long ownerTC;

    @Getter
    @Setter
    @Column(name = "owner_vkn",unique = true)
    private Long ownerVKN;

    @Getter
    @Setter
    @Column(name = "owner_vd")
    private String ownerVD;

    @Getter
    @Setter
    @Column(name = "owner_name")
    private String ownerName;

    @Getter
    @Setter
    @Column(name = "owner_surname")
    private String ownerSurname;

    @Getter
    @Setter
    @Column(name = "owner_phone")
    private String ownerPhone;

    @Getter
    @Setter
    @Column(name = "owner_address")
    private String ownerAddress;

}
