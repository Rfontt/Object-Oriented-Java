package account;

public class CheckingAccount extends Account{
    public CheckingAccount(int agency, int number) {
        super(agency, number);
    }

    @Override
    public boolean withdrawMoney(double money) {
        double amountToWithdraw = money + 0.2;
        return super.withdrawMoney(amountToWithdraw);
    }
}
