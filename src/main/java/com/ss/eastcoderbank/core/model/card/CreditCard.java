package com.ss.eastcoderbank.core.model.card;

import com.ss.eastcoderbank.core.model.user.User;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Random;

@Entity
@Data
@NoArgsConstructor
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

    public CreditCard(List<User> users, String nickName) {
        this.setUsers(users);
        this.setNickName(nickName);
        this.DefaultCredit();
    }

    public void DefaultCredit(){
        //this.setCvv();
        this.setCardType(CardType.CREDIT);
        this.setOpenDate(LocalDate.now());
        this.setExpDate(this.getOpenDate().plusYears(3));
        //ADJUST WHEN ACTIVATION PROTOCOL MADE
        this.setActiveStatus(true);
        this.setInterestRate(0.01);
        this.setAvailableCredit(600.00F);
        this.setBalance(0F);
        this.setDueDate(this.getOpenDate().plusMonths(1));
        this.setMinDue(25F);
    }

}
