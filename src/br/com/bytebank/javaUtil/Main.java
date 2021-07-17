package br.com.bytebank.javaUtil;

import br.com.bytebank.account.CheckingAccount;
import br.com.bytebank.exceptions.Account;

public class Main {
    public static void main(String[] args) {
        CheckingAccount[] checkingAccount = new CheckingAccount[5];
        CheckingAccount firstCheckingAccount = new CheckingAccount(11111, 22222);

        checkingAccount[0] = firstCheckingAccount;

        Account account = new Account(1111, 22222);
        Account outherAccount = new Account(11111, 99999);
        ReferenceKeeper keeper = new ReferenceKeeper();

        keeper.addReference(account);
        keeper.addReference(outherAccount);

        System.out.println(keeper.getNumberOfElements());

        Account reference = (Account) keeper.getReference(1);

        System.out.println(reference.getNumber());
    }
}
