package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.card.DebitCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DebitRepository extends JpaRepository<DebitCard, Integer> {

}
