package com.ss.eastcoderbank.core.model.loan;

import com.ss.eastcoderbank.core.model.account.Account;
import com.ss.eastcoderbank.core.model.transaction.TransactionType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Loan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String description;

    @Enumerated
    @Column(name = "type_id")
    private LoanType type;

    @Column(nullable = false)
    private LocalDate openDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    @Column(nullable = false)
    private Float amountLoaned;

    @Column(nullable = false)
    private Float amountRemaining;

    @Column(nullable = false)
    private Float amountDue;

    @Column(nullable = false)
    private Float apr;

    @Column(nullable = false)
    private Boolean goodStanding;

    @Column(nullable = false)
    private Boolean active;

}
