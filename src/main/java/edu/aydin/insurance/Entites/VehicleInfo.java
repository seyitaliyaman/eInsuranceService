package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_info")
@NoArgsConstructor
public class VehicleInfo {

    @Getter
    @Setter
    @Column(name = "owner_id")
    private Long ownerId;

    @Getter
    @Setter
    @Column(name = "vehicle_licence_plate")
    private String vehicleLicencePlate;

    @Getter
    @Setter
    @Column(name = "vehicle_brand")
    private String vehicleBrand;

    @Getter
    @Setter
    @Column(name = "vehicle_model")
    private String vehicleModel;

    @Getter
    @Setter
    @Column(name = "vehicle_usage")
    private String vehicleUsage;

}
