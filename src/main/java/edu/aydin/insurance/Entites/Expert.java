package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "expert")
@NoArgsConstructor
public class Expert {

    @Getter
    @Setter
    @Column(name = "id")
    private Long id;

    @Getter
    @Setter
    @Column(name = "expert_name")
    private String expertName;

    @Getter
    @Setter
    @Column(name = "expert_surname")
    private String expertSurname;

    @Getter
    @Setter
    @Column(name = "expert_phone")
    private String expertPhone;
}
