package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
public class DriverDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String driverTC;

    @Getter
    @Setter
    private String driverName;

    @Getter
    @Setter
    private String driverSurname;

    @Getter
    @Setter
    private String driverPhone;
}
