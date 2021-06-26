package account;

public abstract class Account {
	private double balance;
	private int agency;
	private int number;
	private Client holder;
	private static int total;

	public Account(int agency, int number) {
		Account.total++;
		this.agency = agency;
		this.number = number;
	}

	public void depositedBalance(double value) {
		this.balance += value;

		System.out.println(this.balance);
	}

	public boolean withdrawMoney(double money) {
		if(this.balance >= money) {
			this.balance -= money;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean transferMoney(double value, Account destiny) {
		boolean withdrawMoneyMethod = this.withdrawMoney(value);
		
		if(withdrawMoneyMethod) {
			destiny.depositedBalance(value);
			return true;
		}
			return false;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public int setNumber(int number) {
		if (number <= 0) {
			System.out.println("Não é permitido valores negativos");
			return 0;
		}

		this.number = number;
		
		return this.number;
	}
	
	public int getAgency() {
		return this.agency;
	}
	
	public void setAgency(int agency) {
		if(agency <= 0) {
			System.out.println("Não é permitido valores negativos");
			return;
		}

		this.agency = agency;
	}

	public Client getHolder() {
		return holder;
	}

	public void setHolder(Client holder) {
		this.holder = holder;
	}

	public static int getTotal() {
		return total;
	}
}
