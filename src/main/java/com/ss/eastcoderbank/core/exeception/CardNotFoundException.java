package com.ss.eastcoderbank.core.exeception;

public class CardNotFoundException extends RuntimeException{
    public CardNotFoundException() {
        super("Card not found");
    }

    public CardNotFoundException(String message) {
        super(message);
    }
}