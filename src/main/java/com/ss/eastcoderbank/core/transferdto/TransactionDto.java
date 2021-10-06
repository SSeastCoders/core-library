package com.ss.eastcoderbank.core.transferdto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.ss.eastcoderbank.core.model.transaction.TransactionType;
import lombok.Data;

import java.time.LocalDate;

@Data
public class TransactionDto {
    private Integer id;

    private Float amount;

    private String description;

    private TransactionType type;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    private Boolean succeeded;

    private Boolean pending;
}
