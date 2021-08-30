package com.ss.eastcoderbank.core.transfermapper;

import com.ss.eastcoderbank.core.model.card.CreditCard;
import com.ss.eastcoderbank.core.transferdto.CreditCardDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CardMapper {

    //@Mapping()
    CreditCardDto mapToDto(CreditCard card);
}
