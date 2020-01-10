package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.UsedPieces;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsedPiecesRepository extends JpaRepository<UsedPieces, Long> {

    Optional<List<UsedPieces>> findAllByWorkOrder(Long id);

}
