package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.BankInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BankInfoRepository extends JpaRepository<BankInfo,Long> {
}
