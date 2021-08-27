package com.ss.eastcoderbank.core.model.card;

import com.ss.eastcoderbank.core.model.user.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class CreditCard implements Card{

    // generation strategies to make fit card pattern
    //#### #### #### ####
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Id
    protected Integer id;

    @ManyToMany
    @JoinTable(
            name = "card_users",
            joinColumns = @JoinColumn(name = "card_id"), inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    protected List<User> users;

    // ###
    @GeneratedValue
    @Column(nullable = false)
    protected Integer cvv;

    @Enumerated
    @Column(nullable = false, name = "type_id")
    protected CardType cardType;

    @Column(nullable = false)
    protected LocalDate openDate;

    //SHOULD BE AUTO
    @Column(nullable = false)
    protected LocalDate expDate;

    //?
    @Column(nullable = false, length = 20)
    protected String nickName;

    @Column(nullable = false)
    protected Boolean activeStatus;

    //??account

    @Column(nullable = false)
    protected Double interestRate;

    @Column(nullable = false)
    protected Float creditLimit;

    @Column(nullable = false)
    protected Float availableCredit;

    @Column(nullable = false)
    protected Float balance;

    //SHOULD BE AUTO
    @Column(nullable = false)
    protected LocalDate dueDate;

    @Column(nullable = false)
    protected Float minDue;

    //? Autogenerate 4 digit card number

}
