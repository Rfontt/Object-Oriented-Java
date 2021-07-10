package br.com.bytebank.javaUtil;

import br.com.bytebank.account.CheckingAccount;
import br.com.bytebank.exceptions.Account;

public class Main {
    public static void main(String[] args) {
        int[] ages = new int[5];

        ages[0] = 29;

        CheckingAccount[] checkingAccount = new CheckingAccount[5];
        CheckingAccount firstCheckingAccount = new CheckingAccount(11111, 22222);

        checkingAccount[0] = firstCheckingAccount;

        Account account = new Account(1111, 22222);
        Account outherAccount = new Account(11111, 2222);
        ReferenceKeeper keeper = new ReferenceKeeper();

        keeper.add(account);
        keeper.add(outherAccount);

        System.out.println(keeper.getNumberOfElements());

        Account reference = keeper.getReference(0);

        System.out.println(reference.getNumber());
    }
}
