package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "service")
@NoArgsConstructor
public class Service {

    @Getter
    @Setter
    @Column(name = "tax_id")
    private Long taxId;

    @Getter
    @Setter
    @Column(name = "service_phone")
    private String servicePhone;
}
