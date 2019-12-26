package edu.aydin.insurance.Entites;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;


@Entity
@Table(name = "cases")
@NoArgsConstructor
public class Cases {

    @Getter
    @Setter
    @Column(name = "case")
    private Long caseId;
    @Getter
    @Setter
    @Column(name = "file_no")
    private Long fileNo;

    @Getter
    @Setter
    @Column(name = "policy_no")
    private Long policyNo;

    @Getter
    @Setter
    @Column(name = "agency_no")
    private Long agencyNo;

    @Getter
    @Setter
    @Column(name = "policy_start_date")
    private Date policyStartDate;

    @Getter
    @Setter
    @Column(name = "policy_end_date")
    private Date policyEndDate;

    @Getter
    @Setter
    @Column(name = "expert_id")
    private Long expertId;


}
