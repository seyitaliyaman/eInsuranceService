package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class WorkmanshipPartDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String partName;
}
