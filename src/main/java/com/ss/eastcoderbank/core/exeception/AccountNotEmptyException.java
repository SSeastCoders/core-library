package com.ss.eastcoderbank.core.exeception;

public class AccountNotEmptyException extends RuntimeException{
    public AccountNotEmptyException() {
        super("Account has unused funds");
    }

    public AccountNotEmptyException(String message) {
        super(message);
    }
}