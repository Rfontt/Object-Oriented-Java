package br.com.bytebank.account;

import br.com.bytebank.account.Client;

public abstract class Account {
	private double balance;
	private int agency;
	private int number;
	private Client holder;
	private static int total;

	public Account(int agency, int number) {
		if(agency < 1 | number < 1) {
			throw new IllegalArgumentException("Invalid agency our number");
		}

		Account.total++;
		this.agency = agency;
		this.number = number;
	}

	public void depositedBalance(double value) {
		this.balance += value;

		System.out.println(this.balance);
	}

	public void withdrawMoney(double money) {
		if(this.balance < money) {
			throw new InsufficientFundsException("Insufficient money " + money);
		}

		this.balance -= money;
	}
	
	public void transferMoney(double value, Account destiny) {
		this.withdrawMoney(value);
		destiny.depositedBalance(value);
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
