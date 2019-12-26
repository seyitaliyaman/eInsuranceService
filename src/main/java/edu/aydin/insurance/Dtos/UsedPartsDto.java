package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class UsedPartsDto {
    @Getter
    @Setter
    private Long fileNo;

    @Getter
    @Setter
    private Long partId;
}
