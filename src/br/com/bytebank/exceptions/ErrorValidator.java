package br.com.bytebank.exceptions;

public class ErrorValidator extends RuntimeException{
    public ErrorValidator(String message) {
        super(message);
    }
}
