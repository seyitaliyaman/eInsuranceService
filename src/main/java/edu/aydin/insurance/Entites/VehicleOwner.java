package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_owner")
@NoArgsConstructor
public class VehicleOwner {

    @Getter
    @Setter
    @Column(name = "file_no")
    private Long fileNo;

    @Getter
    @Setter
    @Column(name = "tckn")
    private Long tckn;

    @Getter
    @Setter
    @Column(name = "vehicle_owner_name")
    private String vehicleOwnerName;

    @Getter
    @Setter
    @Column(name = "vehicle_owner_surname")
    private String vehicleOwnerSurname;

    @Getter
    @Setter
    @Column(name = "vehicle_owner_phone")
    private String vehicleOwnerPhone;
}
