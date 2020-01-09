package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ServiceIncDto {

    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String serviceName;

    @Getter
    @Setter
    private String servicePhone;

    @Getter
    @Setter
    private Long VKN;

    @Getter
    @Setter
    private String VD;

    @Getter
    @Setter
    private String serviceAddress;

    @Getter
    @Setter
    private String serviceEmail;

}
