package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.card.CreditCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CreditRepository extends JpaRepository<CreditCard, Integer> {

}
