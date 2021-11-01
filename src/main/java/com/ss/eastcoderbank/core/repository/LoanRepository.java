package com.ss.eastcoderbank.core.repository;

import com.ss.eastcoderbank.core.model.loan.Loan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Integer> {

    default Page<Loan> findLoanByUsers(Integer id, Pageable pageable) {
        return findLoanByUsers(id, pageable);
    }

}
