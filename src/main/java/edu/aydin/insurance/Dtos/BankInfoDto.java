package edu.aydin.insurance.Dtos;

import lombok.Getter;
import lombok.Setter;


public class BankInfoDto {
    @Getter
    @Setter
    private Long filoNo;

    @Getter
    @Setter
    private String bankName;

    @Getter
    @Setter
    private String branch;

    @Getter
    @Setter
    private Long branchNo;

    @Getter
    @Setter
    private Long accountNo;

    @Getter
    @Setter
    private Long iban;

}
