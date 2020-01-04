package edu.aydin.insurance.Dtos;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class PieceDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String pieceName;

    @Getter
    @Setter
    private Long piecePrice;
}
