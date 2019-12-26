package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bank_info")
@NoArgsConstructor
public class BankInfo {

    @Getter
    @Setter
    @Column(name = "filo_no")
    private Long filoNo;

    @Getter
    @Setter
    @Column(name = "bank_name")
    private String bankName;

    @Getter
    @Setter
    @Column(name = "branch")
    private String branch;

    @Getter
    @Setter
    @Column(name = "branch_no")
    private Long branchNo;

    @Getter
    @Setter
    @Column(name = "account_no")
    private Long accountNo;

    @Getter
    @Setter
    @Column(name = "iban")
    private Long iban;
}
