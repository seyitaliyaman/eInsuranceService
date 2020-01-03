package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.Piece;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PieceRepository extends JpaRepository<Piece, Long> {
}
