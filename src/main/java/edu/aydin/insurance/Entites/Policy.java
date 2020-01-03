package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "policy")
@NoArgsConstructor
public class Policy {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "policy-sequence-generator")
    @GenericGenerator(
            name = "policy-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "policy_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "policy_no")
    private Long policyNo;

    @Getter
    @Setter
    @Column(name = "policy_start_date")
    private Date policyStartDate;

    @Getter
    @Setter
    @Column(name = "policy_end_date")
    private Date policyEndDate;

    @Getter
    @Setter
    @ManyToOne
    private Agency agency;

}
