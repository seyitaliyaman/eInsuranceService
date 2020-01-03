package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "service")
@NoArgsConstructor
public class Service {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "service-sequence-generator")
    @GenericGenerator(
            name = "service-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "service_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "service_name")
    private String serviceName;

    @Getter
    @Setter
    @Column(name = "service_phone")
    private String servicePhone;

    @Getter
    @Setter
    @Column(name = "service_vkn")
    private Long VKN;

    @Getter
    @Setter
    @Column(name = "service_vd")
    private Long VD;

    @Getter
    @Setter
    @Column(name = "service_address")
    private String serviceAddress;

    @Getter
    @Setter
    @Column(name = "service_email")
    private String serviceEmail;

}
