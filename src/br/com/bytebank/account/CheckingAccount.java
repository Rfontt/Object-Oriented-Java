package br.com.bytebank.account;

public class CheckingAccount extends Account{
    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public void withdrawMoney(double money) {
        double amountToWithdraw = money + 0.2;
        super.withdrawMoney(amountToWithdraw);
    }

    @Override
    public String toString() {
        return "Checking account";
    }
}
