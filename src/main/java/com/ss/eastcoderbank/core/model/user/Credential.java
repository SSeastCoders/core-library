package com.ss.eastcoderbank.core.model.user;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class Credential {

    @Column(nullable = false, length = 50)
    public String username;
    @Column(nullable = false, length = 250)
    public String password;



}
