package edu.aydin.insurance.Repository;

import edu.aydin.insurance.Entites.UserAccount;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserAccountRepository extends JpaRepository<UserAccount, Long> {

    Optional<UserAccount> findByUsernameAndPassword(String username,String password);
}
