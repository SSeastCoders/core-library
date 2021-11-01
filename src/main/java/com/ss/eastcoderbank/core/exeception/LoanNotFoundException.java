package com.ss.eastcoderbank.core.exeception;

public class LoanNotFoundException extends RuntimeException{
    public LoanNotFoundException() {
        super("Loan not found");
    }

    public LoanNotFoundException(String message) {
        super(message);
    }
}