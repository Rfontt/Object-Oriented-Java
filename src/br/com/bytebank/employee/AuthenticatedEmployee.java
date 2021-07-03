package br.com.bytebank.employee;

public abstract interface AuthenticatedEmployee {

    public abstract void setPassword(int password);

    public abstract boolean authenticate(int password);
}
