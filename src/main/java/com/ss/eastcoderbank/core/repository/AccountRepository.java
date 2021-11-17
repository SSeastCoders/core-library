package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.account.Account;
import com.ss.eastcoderbank.core.model.account.AccountType;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;


@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    /**
     * Finds all accounts registered to a specific user
     * @param id users id
     * @return list of accounts
     */
    List<Account> findAccountByUsersId(Integer id);

    @Query("select a from Account a where a.nickName like %:nickName% " +
            "and (:fromDate is null or a.openDate >= :fromDate) and " +
            "(:toDate is null or a.openDate <= :toDate) and (:fromAmount is null or a.balance >= :fromAmount) " +
            "and (:toAmount is null or a.balance <= :toAmount) and" +
            "(:type is null or a.accountType = :type) and (:status is null or a.activeStatus = :status)")
    Page<Account> findAccountsByFilter(@Param("nickName") String nickName, @Param("fromDate") LocalDate fromDate, @Param("toDate") LocalDate toDate,
                                       @Param("fromAmount") Float fromAmount, @Param("toAmount") Float toAmount, @Param("type") AccountType type,
                                       @Param("status") Boolean status, Pageable pageable);
}
