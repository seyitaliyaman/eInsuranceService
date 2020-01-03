package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "driver")
@NoArgsConstructor
public class Driver {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "driver-sequence-generator")
    @GenericGenerator(
            name = "driver-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "driver_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "driver_tc")
    private String driverTC;

    @Getter
    @Setter
    @Column(name = "driver_name")
    private String driverName;

    @Getter
    @Setter
    @Column(name = "driver_surname")
    private String driverSurname;

    @Getter
    @Setter
    @Column(name = "driver_phone")
    private String driverPhone;

}
