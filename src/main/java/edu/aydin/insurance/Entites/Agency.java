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
@Table(name = "agency")
@NoArgsConstructor
public class Agency {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "agency-sequence-generator")
    @GenericGenerator(
            name = "agency-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "agency_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "agency_no")
    private Long agencyNo;

    @Getter
    @Setter
    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    private InsuranceCompany insuranceCompany;

}
