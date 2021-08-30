package com.ss.eastcoderbank.core.model.card;

import lombok.extern.slf4j.Slf4j;
import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;

@Slf4j
public class SwipeGenerator implements IdentifierGenerator {
    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {

        try{
            Connection connection = sharedSessionContractImplementor.connection();




        }catch (Exception e){ //(SQLException e) {
            log.error(e.getMessage());
        }

        return null;
    }
}
