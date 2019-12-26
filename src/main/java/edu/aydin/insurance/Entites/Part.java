package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "part")
@NoArgsConstructor
public class Part {

    @Getter
    @Setter
    @Column(name = "part_id")
    private Long partId;

    @Getter
    @Setter
    @Column(name = "part_name")
    private String partName;

    @Getter
    @Setter
    @Column(name = "part_quantity")
    private Long partQuantity;

    @Getter
    @Setter
    @Column(name = "part_price")
    private Long partPrice;
}
