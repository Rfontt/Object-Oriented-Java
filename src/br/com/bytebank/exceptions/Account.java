package br.com.bytebank.exceptions;

public class Account {
    private int number;

    void deposit() throws AccountException{}

    public Account(int agency, int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
