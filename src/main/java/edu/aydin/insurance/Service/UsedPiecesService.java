package edu.aydin.insurance.Service;

import edu.aydin.insurance.Dtos.UsedPiecesDto;
import edu.aydin.insurance.Dtos.WorkOrderDto;
import edu.aydin.insurance.Entites.UsedPieces;
import edu.aydin.insurance.Entites.WorkOrder;
import edu.aydin.insurance.Repository.UsedPiecesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsedPiecesService {

    @Autowired
    private UsedPiecesRepository usedPiecesRepository;

    @Autowired
    private WorkOrderService workOrderService;

    @Autowired
    private PieceService pieceService;

    public UsedPieces addUsedPiece(UsedPiecesDto usedPiecesDto,Long workOrderId){
        UsedPieces usedPieces = fromDto(usedPiecesDto);
        //usedPieces.setWorkOrder(workOrderService.getWorkOrderWithId(workOrderId));
        usedPiecesRepository.save(usedPieces);
        return usedPieces;
    }

    public List<UsedPieces> addUsedPieces(List<UsedPiecesDto> usedPieces,Long workOrderId){
        List<UsedPieces> usedPiecesList = new ArrayList<>();
        for (UsedPiecesDto usedPiece:usedPieces){
            UsedPieces usedPieces1 = fromDto(usedPiece);
            usedPiecesList.add(usedPieces1);
        }
        usedPiecesRepository.saveAll(usedPiecesList);
        return usedPiecesList;
    }

    public List<UsedPiecesDto> getPiecesByWorkOrderId(Long workOrderId){
        Optional<List<UsedPieces>> pieces = usedPiecesRepository.findAllByWorkOrder(workOrderId);
        List<UsedPiecesDto> piecesDtos = new ArrayList<>();
        for (UsedPieces piece: pieces.get()){
            piecesDtos.add(toDto(piece));
        }
        return piecesDtos;
    }

    public UsedPiecesDto toDto(UsedPieces usedPieces){

        List<WorkOrder> list = usedPieces.getWorkOrder();
        List<WorkOrderDto> listDto = new ArrayList<>();
        for (WorkOrder order: list){
            listDto.add(workOrderService.toDto(order));
        }

        return new UsedPiecesDto(
                usedPieces.getId(),
                usedPieces.getQuantity(),
                listDto,
                pieceService.toDto(usedPieces.getPiece())
        );
    }

    public UsedPieces fromDto(UsedPiecesDto usedPiecesDto){

        List<WorkOrderDto> list = usedPiecesDto.getWorkOrderDto();
        List<WorkOrder> listDto = new ArrayList<>();
        for (WorkOrderDto order: list){
            listDto.add(workOrderService.fromDto(order));
        }

        UsedPieces usedPieces = new UsedPieces();
        usedPieces.setId(usedPiecesDto.getId());
        usedPieces.setQuantity(usedPiecesDto.getQuantity());
        usedPieces.setWorkOrder(listDto);
        usedPieces.setPiece(pieceService.fromDto(usedPiecesDto.getPieceDto()));
        return usedPieces;
    }


}
