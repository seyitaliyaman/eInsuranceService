package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.InsuranceCompany;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InsuranceCompanyRepository extends JpaRepository<InsuranceCompany, Long> {
    Optional<InsuranceCompany> findByCompanyName(String companyName);
}
