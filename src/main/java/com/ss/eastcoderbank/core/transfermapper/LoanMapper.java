package com.ss.eastcoderbank.core.transfermapper;

import com.ss.eastcoderbank.core.model.loan.Loan;
import com.ss.eastcoderbank.core.transferdto.LoanDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface LoanMapper {

    LoanDto mapToDto(Loan loan);

}
