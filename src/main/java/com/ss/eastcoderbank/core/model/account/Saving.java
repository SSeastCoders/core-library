package com.ss.eastcoderbank.core.model.account;

import com.ss.eastcoderbank.core.model.account.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
public class Saving extends Account {

    @Column(nullable = false)
    private Integer transactionLimit;

    public Saving() {
        this.interestRate = 0.06;
        this.transactionLimit = 6;
    }

}
