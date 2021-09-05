package com.ss.eastcoderbank.core.model.card;

import com.ss.eastcoderbank.core.repository.CreditRepository;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.Random;

@Slf4j
public class SwipeGenerator implements IdentifierGenerator {

    CreditRepository creditRepository;

    static final private String NUMBERS = "0123456789";
    final private Random r = new SecureRandom();

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        String swipe = randomSwipe(16,4,' ');
        while (creditRepository.findCreditCardsBySwipe(swipe).isPresent()){
            swipe = randomSwipe(16,4,' ');
        }
        return swipe;
    }

    char randomChar(){
        return NUMBERS.charAt(r.nextInt(NUMBERS.length()));
    }

    public String randomSwipe(int length, int spacing, char spacerChar){
        StringBuilder sb = new StringBuilder();
        while(length > 0){
            int spacer = 0;
            if (spacer == spacing) {
                sb.append(spacerChar);
                spacer = 0;
            }
            length --;
            spacer ++;
            sb.append(randomChar());
        }
        return sb.toString();
    }
}
