package br.com.bytebank.exceptions;

public class Flow {
    public static void main(String[] args) {
        System.out.println("Início");
        try {
            method();
        }catch (Exception error) {
            System.out.println("Exception" + error.getMessage());
        }
        System.out.println("Fim do método main");
    }

    public static void method() throws ErrorArithmeticException {
        System.out.println("Início do método 1");
        methodTwo();
        System.out.println("Fim do método 1");
    }

    private static  void methodTwo() throws ErrorArithmeticException {
        System.out.println("Início do método 2");

        for(int i = 1; i<=5; i++) {
            try {
                System.out.println(i/0);
            }catch(Exception error) {
                error.getMessage();
            }
        }

        System.out.println("Fim do método 2");
        throw new ErrorArithmeticException("Error of Arithmetic");
    }
}
