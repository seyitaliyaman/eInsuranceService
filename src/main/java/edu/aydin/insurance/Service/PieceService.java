package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.PieceDto;
import edu.aydin.insurance.Entites.Piece;
import edu.aydin.insurance.Exceptions.PieceNotFoundException;
import edu.aydin.insurance.Repository.PieceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PieceService {

    @Autowired
    private PieceRepository pieceRepository;

    public Piece addPiece(PieceDto pieceDto){
        Piece piece = fromDto(pieceDto);
        pieceRepository.save(piece);
        return piece;
    }

    public PieceDto getPieceById(Long id){
        Optional<Piece> piece = pieceRepository.findById(id);
        if (piece.isPresent()){
            return toDto(piece.get());
        }
        throw new PieceNotFoundException();
    }

    public PieceDto toDto(Piece piece){
        return new PieceDto(piece.getId(),
                piece.getPieceName(),
                piece.getPiecePrice()
        );
    }

    public Piece fromDto(PieceDto pieceDto){
        Piece piece = new Piece();
        piece.setId(pieceDto.getId());
        piece.setPieceName(pieceDto.getPieceName());
        piece.setPiecePrice(pieceDto.getPiecePrice());
        return piece;

    }

}
