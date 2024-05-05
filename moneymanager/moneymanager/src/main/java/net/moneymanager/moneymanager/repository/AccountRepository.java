package net.moneymanager.moneymanager.repository;

import net.moneymanager.moneymanager.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {


}
