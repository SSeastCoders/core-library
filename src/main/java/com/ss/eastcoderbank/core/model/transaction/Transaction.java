package com.ss.eastcoderbank.core.model.transaction;

import com.ss.eastcoderbank.core.model.account.Account;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Account account;

    private Double amount;

    private String description;

    @Enumerated
    @Column(name = "type_id")
    private TransactionType type;

    private LocalDateTime date;

    private Boolean pending;

    private Boolean succeeded;
}
