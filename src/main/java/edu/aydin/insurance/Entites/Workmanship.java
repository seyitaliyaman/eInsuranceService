package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "workmanship")
@NoArgsConstructor
public class Workmanship {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "workmanship-sequence-generator")
    @GenericGenerator(
            name = "workmanship-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "workmanship_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "cost")
    private Long cost;

    @Getter
    @Setter
    @Column(name = "is_done")
    private boolean isDone;

    @Getter
    @Setter
    @ManyToMany
    private List<WorkOrder> workOrder;

    @Getter
    @Setter
    @ManyToMany
    private List<WorkmanshipPart> workmanshipPart;

    @Getter
    @Setter
    @ManyToMany
    private List<VehiclePart> vehiclePart;


}
