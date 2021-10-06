package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.transaction.Transaction;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {
    Page<Transaction> findTransactionByAccountIdAndDescriptionContainingAndDateBetweenAndAmountBetween(Integer id, String search, LocalDate start, LocalDate end, Float fromAmount, Float toAmount, Pageable pageable);
    Page<Transaction> findTransactionByAccountIdAndDescriptionContaining(Integer id, Pageable pageable, String search);

    default Page<Transaction> findTransactionByOptions(Integer id, String search, LocalDate start, LocalDate end, Float fromAmount, Float toAmount, Pageable pageable) {
        return findTransactionByAccountIdAndDescriptionContainingAndDateBetweenAndAmountBetween(id, search, start, end, fromAmount, toAmount, pageable);
    }
}
