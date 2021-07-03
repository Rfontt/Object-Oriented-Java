package br.com.bytebank.exceptions;

public class Connection implements AutoCloseable{
    public Connection() {
        System.out.println("Open connection");
    }

    public void readDatas() {
        System.out.println("Receiving data");
        throw new IllegalStateException();
    }

    @Override
    public void close() {
        System.out.println("Close connection");
    }
}
