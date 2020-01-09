package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "cases")
@NoArgsConstructor
public class Cases {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "case-sequence-generator")
    @GenericGenerator(
            name = "case-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "case_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;


    @Getter
    @Setter
    @Column(name = "file_no")
    private Long fileNo;

    @Getter
    @Setter
    @Column(name = "create_date")
    private Date createDate;


    @Getter
    @Setter
    @ManyToOne
    private Policy policy;

    @Getter
    @Setter
    @OneToOne
    private IncidentInfo incidentInfo;

    @Getter
    @Setter
    @ManyToOne
    private ServiceInc service;

    @Getter
    @Setter
    @ManyToOne
    private Expert expert;


}
