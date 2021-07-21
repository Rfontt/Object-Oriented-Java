package br.com.bytebank.javaUtil;

import br.com.bytebank.account.Account;
import br.com.bytebank.account.CheckingAccount;
import java.util.Comparator;

import java.util.ArrayList;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {
        Account accountOne = new CheckingAccount(2222, 1111);
        Account accountTwo = new CheckingAccount(44444, 322111);
        Account accountThree = new CheckingAccount(44444, 00001);

        accountOne.depositedBalance(2200);
        accountThree.depositedBalance(1000);
        accountThree.depositedBalance(10000);

        List<Account> list = new ArrayList<>();
        list.add(accountOne);
        list.add(accountTwo);
        list.add(accountThree);

        list.sort((c1, c2) -> Integer.compare(c1.getNumber(), c2.getNumber()));

        for (Account account : list) {
            System.out.println(account.getNumber());
        }
    }
}
