package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class PartDto {
    @Getter
    @Setter
    private Long partId;

    @Getter
    @Setter
    private String partName;

    @Getter
    @Setter
    private Long partQuantity;

    @Getter
    @Setter
    private Long partPrice;
}
