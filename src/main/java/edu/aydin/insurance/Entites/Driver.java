package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "driver")
@NoArgsConstructor
public class Driver {

    @Getter
    @Setter
    @Column(name = "file_no")
    private Long fileNo;

    @Getter
    @Setter
    @Column(name = "driver_tckn")
    private Long tckn;

    @Getter
    @Setter
    @Column(name = "driver_name")
    private String driverName;

    @Getter
    @Setter
    @Column(name = "driver_surname")
    private String driverSurname;

    @Getter
    @Setter
    @Column(name = "driver_phone")
    private String driverPhone;


}
