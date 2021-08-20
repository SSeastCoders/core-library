package com.ss.eastcoderbank.core.transfermapper;

import com.ss.eastcoderbank.core.model.transaction.Transaction;
import com.ss.eastcoderbank.core.transferdto.TransactionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {

   TransactionDto mapToDto(Transaction transaction);
}
