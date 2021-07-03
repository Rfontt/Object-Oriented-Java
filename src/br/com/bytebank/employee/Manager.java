package br.com.bytebank.employee;

public class Manager extends Employee implements AuthenticatedEmployee{
    private UserFulAuthentication userFulAuthentication;

    public Manager() {
        this.userFulAuthentication = new UserFulAuthentication();
    }

    @Override
    public void setPassword(int password) {
        this.userFulAuthentication.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.userFulAuthentication.authenticate(password);
    }

    public double getBonus() {
        return super.getSalary();
    }
}
