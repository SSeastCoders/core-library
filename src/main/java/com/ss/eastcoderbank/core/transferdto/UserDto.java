package com.ss.eastcoderbank.core.transferdto;

import com.ss.eastcoderbank.core.model.user.Address;
import com.ss.eastcoderbank.core.model.user.UserRole;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class UserDto {
    private Integer id;

    private UserRole role;

    private String firstName;

    private String lastName;

    private LocalDate dob;

    private String email;

    private String phone;

    private Address address;

    private LocalDate dateJoined;

    private Boolean activeStatus;

    private String username;
}
