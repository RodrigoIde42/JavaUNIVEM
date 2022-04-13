package aula03;

public class Exerc01 {
    
    public Exerc01() {

        System.out.println("Exercício 01");

        for (int i = 0; i < 100; i++) {
            System.out.println("Hell No World!!");
            try { Thread.sleep(250); } catch (Exception e) { }
        }

    }

}
