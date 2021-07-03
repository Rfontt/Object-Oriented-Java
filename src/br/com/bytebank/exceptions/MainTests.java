package br.com.bytebank.exceptions;

public class MainTests {
   public static void main(String[] args) {
       Account account = new Account();

       try {
           account.deposit();
       } catch(AccountException error) {
           error.getMessage();
       }

       System.out.println("Hello world");
   }
}
