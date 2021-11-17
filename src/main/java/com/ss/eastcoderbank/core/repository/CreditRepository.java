package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.card.CreditCard;
import com.ss.eastcoderbank.core.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CreditRepository extends JpaRepository<CreditCard, Integer> {
    List<CreditCard> findCreditCardsByUsersIn(List<User> users);

    Optional<CreditCard> findCreditCardsBySwipe(String swipe);
}
