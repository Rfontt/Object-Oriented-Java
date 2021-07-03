package br.com.bytebank.library;

import br.com.bytebank.account.Account;
import br.com.bytebank.account.CheckingAccount;

public class TestLibrary {

	public static void main(String[] args) {
		Account account = new CheckingAccount(1111, 11111);
		
		account.depositedBalance(120);
		
		System.out.println(account.getBalance());

	}

}
