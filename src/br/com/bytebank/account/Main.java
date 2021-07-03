package br.com.bytebank.account;

/**
 * 
 * @author Rita de Cassia. 
 *
 * Essa é a class principal.
 */

public class Main {
	public static void main(String[] args) {
		Account account = new CheckingAccount(111, 111111);

		account.depositedBalance(200.0);

		try {
			account.withdrawMoney(300);
		} catch(InsufficientFundsException error) {
			System.out.println(error.getMessage());
		}
	}
}
