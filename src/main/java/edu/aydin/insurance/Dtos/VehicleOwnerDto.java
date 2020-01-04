package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class VehicleOwnerDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private Long ownerTC;

    @Getter
    @Setter
    private Long ownerVKN;

    @Getter
    @Setter
    private Long ownerVD;

    @Getter
    @Setter
    private String ownerName;

    @Getter
    @Setter
    private String ownerSurname;

    @Getter
    @Setter
    private String ownerPhone;
}
