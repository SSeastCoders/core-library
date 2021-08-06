package com.ss.eastcoderbank.core.transferdto;

import com.ss.eastcoderbank.core.model.account.AccountType;
import com.ss.eastcoderbank.core.model.user.User;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class AccountDto {
    private Integer id;

    private AccountType accountType;

    private List<User> users;

    private Double interestRate;

    private LocalDate openDate;

    private Float balance;

    private Boolean activeStatus;
}
