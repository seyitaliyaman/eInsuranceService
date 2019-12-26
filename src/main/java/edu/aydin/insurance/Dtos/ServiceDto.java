package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class ServiceDto {

    @Getter
    @Setter
    private Long taxId;

    @Getter
    @Setter
    private String servicePhone;
}
