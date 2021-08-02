package com.ss.eastcoderbank.core.model.account;

import com.ss.eastcoderbank.core.model.account.Account;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@ToString
public class Checking extends Account {

    public Checking() {
        this.interestRate = 0.03;
    }

}
