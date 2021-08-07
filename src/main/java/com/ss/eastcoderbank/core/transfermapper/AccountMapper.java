package com.ss.eastcoderbank.core.transfermapper;

import com.ss.eastcoderbank.core.model.account.Account;
import com.ss.eastcoderbank.core.transferdto.AccountDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface AccountMapper {
    AccountDto mapToDto(Account account);
}
