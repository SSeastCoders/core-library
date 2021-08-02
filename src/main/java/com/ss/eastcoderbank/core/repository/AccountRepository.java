package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.account.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}
