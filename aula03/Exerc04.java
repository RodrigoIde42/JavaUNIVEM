package aula03;

public class Exerc04 {

    static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
    
    public Exerc04() {

        System.out.println("Exercício 04");

        for (int i = 1; i < 21; i++) {
            if (fibonacci(i) % 2 == 0) {
                System.out.println("(" + i + ") " + fibonacci(i) + " - Par");
            } else {
                System.out.println("(" + i + ") " + fibonacci(i) + " - Ímpar");   
            }
            try { Thread.sleep(250); } catch (Exception e) { }
        }

    }

}
