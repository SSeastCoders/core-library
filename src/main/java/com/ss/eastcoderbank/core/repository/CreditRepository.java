package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.card.CreditCard;
import com.ss.eastcoderbank.core.model.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface CreditRepository extends JpaRepository<CreditCard, Integer> {
    List<CreditCard> findCreditCardsByUsersIn(List<User> users);

    Optional<CreditCard> findCreditCardsBySwipe(String swipe);

    @Query("select a from CreditCard a where a.nickName like %:nickName% " +
            "and (:fromDate is null or a.openDate >= :fromDate) and " +
            "(:toDate is null or a.openDate <= :toDate) and (:fromAmount is null or a.balance >= :fromAmount) " +
            "and (:toAmount is null or a.balance <= :toAmount) and" +
            "(:status is null or a.activeStatus = :status)")
    Page<CreditCard> findCreditCardByFilter(@Param("nickName") String nickName, @Param("fromDate") LocalDate fromDate, @Param("toDate") LocalDate toDate,
                                       @Param("fromAmount") Float fromAmount, @Param("toAmount") Float toAmount,
                                       @Param("status") Boolean status, Pageable pageable);
}
