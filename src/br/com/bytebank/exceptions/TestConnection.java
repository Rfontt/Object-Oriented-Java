package br.com.bytebank.exceptions;

public class TestConnection {
    public static void main(String[] args) {
        try(Connection connection = new Connection()) {
            connection.readDatas();
        } catch (IllegalStateException error) {
            System.out.println("Error in class");
        }
    }
}
