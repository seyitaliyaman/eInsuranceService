package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "used_parts")
@NoArgsConstructor
public class UsedParts {

    @Getter
    @Setter
    @Column(name = "file_no")
    private Long fileNo;

    @Getter
    @Setter
    @Column(name = "part_id")
    private Long partId;
}
