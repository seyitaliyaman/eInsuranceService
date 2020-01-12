package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class UsedPiecesDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long quantity;

    @Getter
    @Setter
    private WorkOrderDto workOrderDto;

    @Getter
    @Setter
    private PieceDto pieceDto;
}
