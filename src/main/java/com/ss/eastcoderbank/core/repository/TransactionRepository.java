package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.transaction.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    Page<Transaction> findTransactionByAccountId(Integer id, Pageable pageable);
}
