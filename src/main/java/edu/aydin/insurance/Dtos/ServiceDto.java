package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ServiceDto {

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
    private Long VD;

    @Getter
    @Setter
    private String serviceAddress;

    @Getter
    @Setter
    private String serviceEmail;

}
