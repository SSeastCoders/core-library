package com.ss.eastcoderbank.core.transferdto;

import com.ss.eastcoderbank.core.model.account.AccountType;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class AccountDto {
    private Integer id;

    private AccountType accountType;

    private List<UserDto> users;

    private Double interestRate;

    private LocalDate openDate;

    private Float balance;

    private Boolean activeStatus;

    private String nickName;
}
