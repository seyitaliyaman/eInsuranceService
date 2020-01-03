package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.InsuranceCompany;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsuranceCompanyRepository extends JpaRepository<InsuranceCompany, Long> {
}
