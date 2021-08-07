package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    /**
     * Finds all accounts registered to a specific user
     * @param id users id
     * @return list of accounts
     */
    List<Account> findAccountByUsersId(Integer id);
}
