package com.ss.eastcoderbank.core.model.user;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.ss.eastcoderbank.core.constraints.UserConstraints;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Table(uniqueConstraints = {
        @UniqueConstraint(name = UserConstraints.EMAILANDUSERNAME, columnNames = {"email", "username"}),
        @UniqueConstraint(name = UserConstraints.EMAIL, columnNames = {"email"}),
        @UniqueConstraint(name = UserConstraints.USERNAME, columnNames = {"username"})
})
public class User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;

    @JsonBackReference
    @ManyToOne(cascade = CascadeType.PERSIST)
    private UserRole role;

    @Column(length = 20, name = "first_name")
    private String firstName;

    @Column(length = 40, name = "last_name")
    private String lastName;

    private LocalDate dob;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(length = 20)
    private String phone;

    @Embedded
    private Address address;

    @Column(name = "date_joined")
    private LocalDate dateJoined;

    @Column(name = "active_status")
    private boolean activeStatus;

    @Embedded
    private Credential credential;
}
