package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    @Query("SELECT a FROM Account a JOIN a.users u WHERE u.id = ?1")
    List<Account> findAccountByUser(Integer userid);
}
