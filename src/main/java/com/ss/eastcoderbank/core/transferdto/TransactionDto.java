package com.ss.eastcoderbank.core.transferdto;

import com.ss.eastcoderbank.core.model.transaction.TransactionType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class TransactionDto {
    private Integer id;

    private Double amount;

    private String description;

    private TransactionType type;

    private LocalDateTime date;

    private Boolean succeeded;

    private Boolean pending;
}
