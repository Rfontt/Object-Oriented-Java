package br.com.bytebank.javaUtil;

import br.com.bytebank.account.Account;

import java.util.Comparator;

public class Comparators implements Comparator<Account> {
    @Override
    public int compare(Account c1, Account c2) {
        if(c1.getNumber() < c2.getNumber()) {
            return -1;
        }
        else if(c1.getNumber() > c2.getNumber()) {
            return 1;
        }

        return 0;
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
