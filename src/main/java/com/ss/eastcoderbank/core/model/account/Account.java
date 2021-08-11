package com.ss.eastcoderbank.core.model.account;

import com.ss.eastcoderbank.core.model.user.User;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Account {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Id
    protected Integer id;

    @Enumerated
    @Column(nullable = false, name = "type_id")
    protected AccountType accountType;

    @Column(nullable = false, length = 20)
    protected String nickName;

    @ManyToMany
    @JoinTable(
            name = "account_users",
            joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    protected List<User> users;

    @Column(nullable = false)
    protected Double interestRate;

    @Column(nullable = false)
    protected LocalDate openDate;

    @Column(nullable = false)
    protected Float balance;

    @Column(nullable = false)
    protected Boolean activeStatus;
}
