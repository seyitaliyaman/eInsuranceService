package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class WorkmanshipDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long cost;

    @Getter
    @Setter
    private boolean isDone;

    @Getter
    @Setter
    private WorkmanshipPartDto workmanshipPartDto;

    @Getter
    @Setter
    private VehiclePartDto vehiclePartDto;

}
