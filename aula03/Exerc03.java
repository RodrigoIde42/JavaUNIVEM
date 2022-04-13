package aula03;

public class Exerc03 {

    static long fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public Exerc03() {

        System.out.println("Exercício 03");

        for (int i = 1; i < 31; i++) {
            System.out.println("(" + i + ") " + fibonacci(i));
            try { Thread.sleep(250); } catch (Exception e) { }
        }

    }

}
