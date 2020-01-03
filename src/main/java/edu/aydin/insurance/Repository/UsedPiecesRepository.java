package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.UsedPieces;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsedPiecesRepository extends JpaRepository<UsedPieces, Long> {
}
