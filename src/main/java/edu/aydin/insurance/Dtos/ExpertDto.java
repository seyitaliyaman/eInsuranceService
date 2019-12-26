package edu.aydin.insurance.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
public class ExpertDto {
    @Getter
    @Setter
    private Long id;

    @Getter
    @Setter
    private String expertName;

    @Getter
    @Setter
    private String expertSurname;

    @Getter
    @Setter
    private String expertPhone;
}
