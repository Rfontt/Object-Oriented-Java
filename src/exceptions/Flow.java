package exceptions;

public class Flow {
    public static void main(String[] args) {
        System.out.println("Início");
        method();
        System.out.println("Fim do método main");
    }

    public static void method() {
        System.out.println("Início do método 1");
        methodTwo();
    }

    private static  void methodTwo() {
        System.out.println("Início do método 2");

        for(int i = 1; i<=5; i++) {
            try {
                System.out.println(i/0);
            }catch(ArithmeticException error) {
                error.getMessage();
            }
        }

        System.out.println("Fim do método 2");
    }
}
