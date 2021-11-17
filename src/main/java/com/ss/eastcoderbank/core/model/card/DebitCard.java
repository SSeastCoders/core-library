package com.ss.eastcoderbank.core.model.card;

import com.ss.eastcoderbank.core.model.user.User;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class DebitCard implements Card {

    // generation strategies to make fit card pattern
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    @Id
    protected Integer id;

    @GenericGenerator(name = "swipe", strategy = "com.ss.eastcoderbank.core.model.SwipeGenerator")
    @GeneratedValue(generator = "swipe")
    protected Integer swipe;

    @ManyToMany
    @JoinTable(
            name = "debit_users",
            joinColumns = @JoinColumn(name = "card_id"), inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    protected List<User> users;

    //PIN
    // ####
    @Column(nullable = false)
    protected Integer pin;

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
    protected Float balance;

    //? Autogenerate 4 digit card number

}
