package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "expert")
@NoArgsConstructor
public class Expert {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "expert-sequence-generator")
    @GenericGenerator(
            name = "expert-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "expert_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "expert_name")
    private String expertName;

    @Getter
    @Setter
    @Column(name = "expert_surname")
    private String expertSurname;

    @Getter
    @Setter
    @Column(name = "expert_phone")
    private String expertPhone;
}
