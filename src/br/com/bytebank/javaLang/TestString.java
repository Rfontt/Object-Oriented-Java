package br.com.bytebank.javaLang;

import br.com.bytebank.account.CheckingAccount;
import br.com.bytebank.exceptions.Account;

public class TestString {
    public static void main(String[] args) {
        String name = "RFont";

        var newString = name.replace("F", "ff");

        System.out.println(newString.charAt(0));
        println(2);

        CheckingAccount account = new CheckingAccount(11111, 22222);
        println(account);

        System.out.println(account.toString());
    }

    static int println(int number) {
        return number;
    }

    static void println(Object reference) {
    }
}
