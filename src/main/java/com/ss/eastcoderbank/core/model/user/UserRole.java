package com.ss.eastcoderbank.core.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ss.eastcoderbank.core.model.user.User;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserRole {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @Column(nullable = false, unique = true, length = 20) // title must be unique
    private String title;

    public UserRole(String title) {
        this.title = title;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "role", orphanRemoval = true, fetch = FetchType.LAZY)
    private Set<User> users = new HashSet<>();

}
