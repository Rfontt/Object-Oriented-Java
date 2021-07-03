package br.com.bytebank.account;

public class InsufficientFundsException extends  RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
