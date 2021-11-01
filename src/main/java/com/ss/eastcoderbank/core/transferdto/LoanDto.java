package com.ss.eastcoderbank.core.transferdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ss.eastcoderbank.core.model.loan.LoanType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class LoanDto {

    private Integer id;

    private String description;

    private LoanType type;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate openDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    private Float amountLoaned;

    private Float amountRemaining;

    private Float amountDue;

    private Float apr;

    private Boolean goodStanding;

    private Boolean active;

}
