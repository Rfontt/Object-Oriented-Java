package account;

public class Main {
	public static void main(String[] args) {
		CheckingAccount checkingAccount = new CheckingAccount(111, 2020390239);
		CheckingAccount outherAccount = new CheckingAccount(112, 1202239111);

		checkingAccount.depositedBalance(6600);
		checkingAccount.transferMoney(600, outherAccount);

		System.out.println(checkingAccount.getBalance());
	}
}
