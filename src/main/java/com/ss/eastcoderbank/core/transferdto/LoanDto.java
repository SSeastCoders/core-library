package com.ss.eastcoderbank.core.transferdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ss.eastcoderbank.core.model.loan.LoanType;
import com.ss.eastcoderbank.core.model.user.User;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class LoanDto {

    private Integer id;

    private String description;

    protected String nickName;

    protected List<User> users;

    private LoanType type;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate openDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    private Integer loanTerm;

    private Float amountLoaned;

    private Float amountRemaining;

    private Float amountDue;

    private Float apr;

    private Boolean goodStanding;

    private Boolean active;

}
