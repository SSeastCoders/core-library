package com.ss.eastcoderbank.core.transfermapper;

import com.ss.eastcoderbank.core.model.user.User;
import com.ss.eastcoderbank.core.transferdto.UserDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {

    @Mapping(source = "credential.username", target = "username")
    UserDto mapToDto(User user);
}
