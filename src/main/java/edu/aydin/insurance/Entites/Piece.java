package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "piece")
@NoArgsConstructor
public class Piece {

    @Getter
    @Setter
    @Id
    @GeneratedValue(generator = "piece-sequence-generator")
    @GenericGenerator(
            name = "piece-sequence-generator",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name", value = "piece_sequence"),
                    @Parameter(name = "initial_value", value = "1"),
                    @Parameter(name = "increment_size", value = "1")
            }
    )
    private Long id;

    @Getter
    @Setter
    @Column(name = "piece_name")
    private String pieceName;

    @Getter
    @Setter
    @Column(name = "piece_price")
    private Long piecePrice;

}
