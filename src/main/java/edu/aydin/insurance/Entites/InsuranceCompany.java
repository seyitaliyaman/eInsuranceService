package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;


@Entity
@Table(name = "insurance_company")
@NoArgsConstructor
public class InsuranceCompany {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "insurancecompany-sequence-generator")
    @GenericGenerator(
            name = "insurancecompany-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "insurancecompany_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "company_name")
    private String companyName;

}
