package br.com.bytebank.javaUtil;

import br.com.bytebank.account.CheckingAccount;
import br.com.bytebank.account.Account;

import java.util.ArrayList;

public class TestUtil {
    public static void main(String[] args) {
        ArrayList<Account> list = new ArrayList<Account>();

        Account checkingAccount = new CheckingAccount(1111, 2222);
        Account checkingAccountTwo = new CheckingAccount(34545, 32434);
        Account checkingAccountTree = new CheckingAccount(34545, 32434);

        list.add(checkingAccount);
        list.add(checkingAccountTwo);

        Account reference = list.get(1);

        System.out.println(reference.getNumber());

        boolean exists = list.contains(checkingAccountTree);

        System.out.println(exists);

        for (Account account : list) {
            System.out.println(account);
        }
    }
}
