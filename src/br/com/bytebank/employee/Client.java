package br.com.bytebank.employee;

public class Client implements AuthenticatedEmployee{
    private UserFulAuthentication userFullAuthentication;

    public Client() {
        this.userFullAuthentication = new UserFulAuthentication();
    }

    @Override
    public void setPassword(int password) {
        this.userFullAuthentication.setPassword(password);
    }

    @Override
    public boolean authenticate(int password) {
        return this.userFullAuthentication.authenticate(password);
    }
}
